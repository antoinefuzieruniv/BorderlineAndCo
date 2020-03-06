<template>
  <b-card title="SCAA" img-alt="Image" tag="article" class="mx-auto w-50">
    <b-card-text>
      <b-form>
        <b-form-group
          id="input-group-3"
          class="w-50 mx-auto mb-5"
          label="Liste des composants:"
          label-for="component-selector"
        >
          <b-form-select id="component-selector" v-model="componentSelected" required>
            <b-form-select-option
              v-for="(value, index) in components"
              :value="value"
              :key="index"
            >{{value.name}}</b-form-select-option>
          </b-form-select>
        </b-form-group>
        <div class="h-25 m-5 border border-dark rounded p-3" v-if="componentSelected">
          <b-row>
            <b-col class="border-right">
              <p>Services fournis :</p>
              <div v-for="port in componentSelected.listPortOut" :key="port.id">
                {{port.name}} : {{port.type}}
              </div>
            </b-col>
            <b-col>
              <p>Services requis :</p>
              <div v-for="port in componentSelected.listPortIn" :key="port.id">
                {{port.name}} : {{port.type}}
              </div>
            </b-col>
          </b-row>
        </div>

        <button v-on:click="sendComponentToBack(componentSelected)">Construire</button>
      </b-form>
      <b>Application construite</b>
      <div>
         <p><u>Composants :</u></p>
        <div v-for="component in assemblyReturned.listComponent" :key="component.id">
          {{component.name}} (
              <div v-for="port in component.listPortOut" :key="port.id">
                {{port.name}}-{{port.type}},
              </div>
              <div v-for="port in component.listPortIn" :key="port.id">
                {{port.name}}-{{port.type}},
              </div>
          )
        </div>
        <p><u>Connexions :</u></p>
        <div v-for="connection in assemblyReturned.listConnection" :key="connection.id">
          {{connection.portIn.name}}-{{connection.portOut.type}}->{{connection.portOut.name}}-{{connection.portOut.type}}
        </div>
      </div>
    </b-card-text>
  </b-card>
</template>

<script>
const axios = require("axios");
export default {
  name: "IHMUtilisateur",
  data() {
    return {
      components: [],
      componentSelected: "",
      assemblyReturned: ""
    };
  },
  mounted() {
    axios
      .get("http://localhost:8080/UserController/getAllComponents")
      .then(response => (this.components = response.data));
  },
  methods: {
    sendComponentToBack: function (componentSelected) {
      axios
      .get("http://localhost:8080/UserController/chooseComponent", {
          params: {
            chosenComponent: componentSelected.id
          }
        })
        .then(response => (this.assemblyReturned = response.data));
    }
  }
};
</script>
