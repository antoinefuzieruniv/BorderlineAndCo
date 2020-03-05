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
              v-for="(value, index) in options"
              :value="value"
              :key="index"
            >{{value.name}}</b-form-select-option>
          </b-form-select>
        </b-form-group>
        <div class="h-25 m-5 border border-dark rounded p-3" v-if="componentSelected">
          <b-row>
            <b-col class="border-right">
              <p>Services fournis :</p>
              <div v-for="value in componentSelected.listPortOut" :key="value.id">
                {{value.name}} : {{value.type}}
              </div>
            </b-col>
            <b-col>
              <p>Services requis :</p>
              <div v-for="value in componentSelected.listPortIn" :key="value.id">
                {{value.name}} : {{value.type}}
              </div>
            </b-col>
          </b-row>
        </div>

         <button v-on:click="sendComponentToBack(componentSelected)">Construire</button>
        <router-link
          tag="b-button"
          class="float-right"
          :to="{ name: 'IHMExpert', params: { componentSelected: componentSelected } }"
        >Construire l'application</router-link>
      </b-form>
    </b-card-text>
  </b-card>
</template>

<script>
const axios = require("axios");
export default {
  name: "IHMUtilisateur",
  data() {
    return {
      msg: "Welcome to Your Vue.js App",
      options: [],
      componentSelected: ""
    };
  },
  mounted() {
    axios
      .get("http://localhost:8080/UserController/getAllComponents")
      .then(response => (this.options = response.data));
  },
  methods: {
    sendComponentToBack: function (componentSelected) {
      axios
      .get("http://localhost:8080/UserController/chooseComponent", {
          params: {
            chosenComponent: componentSelected.id
          }
        })
        .then(response => (alert(response.data)));
    }
  }
};
</script>
