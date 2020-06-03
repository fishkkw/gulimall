<template>
  <el-tree :data="data" :props="defaultProps" @node-click="handleNodeClick"></el-tree>
</template>

<script>
export default {
    data:[],
  methods: {
      handleNodeClick(data) {
        console.log(data);
      },
      getMenus(){
        this.$http({
          url: this.$http.adornUrl('/product/basecatalog1/list/tree'),
          method: 'get'
        }).then(({data}) => {
          console.log(data);
         })
      }
    },
    created(){
      this.getMenus();
    }
};
</script>


<style>
</style>