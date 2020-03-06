<template>
  <b-card title="SCAA" img-alt="Image" tag="article" class="mx-auto w-50">
    <b-card-text>
      <b-form>

        <b-form-group
          id="input-group-4"
          class="w-50 mx-auto mb-5"
          label="Liste de toutes connexions possibles:"
          label-for="input-4"
        >
          <b-form-select id="input-4" v-model="connectionSelected" required>
            <b-form-select-option
              v-for="connection in connections" :value=connection :key="connection.id"
            >{{connection.portIn.name}}-{{connection.portOut.type}} -c o- {{connection.portOut.name}}-{{connection.portOut.type}}</b-form-select-option>
          </b-form-select>
        </b-form-group>
        <div><p>Connections préférentielles enregistrées</p>
          <div v-for="connection in preferedConnections" :value=connection :key="connection.id">
            {{connection.portIn.name}}-{{connection.portOut.type}} -c o- {{connection.portOut.name}}-{{connection.portOut.type}}
          </div>
        </div>
        <b-form-checkbox
        id="checkbox-1" 
        v-model="saveChoice" 
        name="checkbox-1">Conserver mon choix</b-form-checkbox>
        
        <button v-on:click="sendConnectionToBack(connectionSelected)" class="float-right" >Choisir</button>
      </b-form>
    </b-card-text>
  </b-card>
</template>

<script>
const axios = require("axios");
export default {
  name: "IMHExpert",
  created() {
    //this.componentSelectedByUser = this.$route.params.componentSelected;
  },
  data() {
    return {
      msg: "Welcome to Your Vue.js App",
      connections: [],
      preferedConnections: [],
      connectionSelected: "",
      saveChoice : false
    };
  },
  mounted() {
    axios
      .get("http://localhost:8080/ExpertController/getConnections")
      .then(response => (this.connections = response.data));
      axios
      .get("http://localhost:8080/ExpertController/getPreferedConnections")
      .then(response => (this.preferedConnections = response.data));
  },
  methods: {
    sendConnectionToBack: function (connectionSelected) {
      axios
      .get("http://localhost:8080/ExpertController/SelectConnection", {
          params: {
            chosenConnection: connectionSelected.id,
            saveChoice: this.saveChoice
          }
        })
        .then(response => (alert("Success")));
    }
  }
};
</script>

<style>
</style>