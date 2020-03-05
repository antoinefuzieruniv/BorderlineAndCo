<template>
  <div id="app" class="mt-0">
    <nav class="navbar navbar-expand-lg navbar-light bg-light mb-3">
        <router-link to="/IHMUtilisateur">
          <a class="nav-link" href="#">IHM utilisateur</a>
        </router-link>
        <router-link to="/IHMExpert">
        <a class="nav-link" href="#">IHM expert</a>
        </router-link>
    </nav>

    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: "App"
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
