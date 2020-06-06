<template>
  <div>
    <div style="width:300px">
      <el-input
        prefix-icon="el-icon-search"
        size="medium"
        placeholder="输入关键字进行过滤"
        v-model="filterText"
        clearable
      ></el-input>
    </div>
    <div style="width:500px">
      <el-tree
        :data="menus"
        :props="defaultProps"
        show-checkbox
        :filter-node-method="filterNode"
        @node-click="handleNodeClick"
        ref="tree"
        :expand-on-click-node="false"
      >
        <span class="custom-tree-node" slot-scope="{ node, data }">
          <span>{{ node.label }}</span>
          <span>
            <el-button v-if="isEdit" type="text" size="mini" @click="() => editData(data)">
              <i class="el-icon-edit"></i>
            </el-button>
            <el-button v-if="isEdit" type="text" size="mini" @click="() => remove(node, data)">
              <i class="el-icon-delete"></i>
            </el-button>
          </span>
        </span>
      </el-tree>
    </div>
    <div>
      <el-dialog title="编辑" :visible.sync="dialogVisible" width="32%">
        <el-form :inline="true" :model="cateTree" class="demo-form-inline">
          <el-form-item label="分类名称">
            <el-col :span="30">
              <el-input v-model="cateTree.name" placeholder="分类名称"></el-input>
            </el-col>
          </el-form-item>
        </el-form>
        <span slot="footer" class="dialog-footer">
          <el-button @click="dialogVisible = false">取 消</el-button>
          <el-button type="primary" @click="dialogVisible = false">确 定</el-button>
        </span>
      </el-dialog>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      cateTree: { name },
      editInputName: "",
      isEdit: true,
      dialogVisible: false,
      filterText: "",
      menus: [],
      defaultProps: {
        children: "child",
        label: "name"
      }
    };
  },
  methods: {
    filterNode(value, data) {
      if (!value) return true;
      return data.name.indexOf(value) !== -1;
    },
    handleNodeClick(data) {
      console.log(data);
    },
    getMenus() {
      this.$http({
        url: this.$http.adornUrl("/product/basecatalog1/list/tree"),
        method: "get"
      }).then(({ data }) => {
        console.log(data.baseCata);
        return (this.menus = data.baseCata);
      });
    },
    editData(data) {
      this.dialogVisible = true;
      this.cateTree.name = data.name;
      this.getMenus();
    },
    remove(node, data) {
      this.$confirm("此操作将永久删除该文件, 是否继续?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      })
        .then(() => {
          this.$message({
            type: "success",
            message: "删除成功!"
          });
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: "已取消删除"
          });
        });
      this.getMenus();
    }
  },
  created() {
    this.getMenus();
  },
  watch: {
    filterText(val) {
      this.$refs.tree.filter(val);
    }
  }
};
</script>


<style>
.custom-tree-node {
  flex: 1;
  display: flex;
  align-items: center;
  justify-content: space-between;
  font-size: 14px;
  padding-right: 8px;
}
</style>