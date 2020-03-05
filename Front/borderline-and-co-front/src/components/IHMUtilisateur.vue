<template>
  <b-card title="SCAA" img-alt="Image" tag="article" class="mx-auto w-50">
    <b-card-text>
      <b-form>
        <b-form-group
          id="input-group-3"
          class="w-50 mx-auto mb-5"
          label="Liste des composants:"
          label-for="input-3"
        >
          <b-form-select id="input-3" v-model="componentSelected" required>
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
              <div v-for="value in componentSelected.services_fournis" :key="value">{{value}}</div>
            </b-col>
            <b-col>
              <p>Services requis :</p>
              <div v-for="value in componentSelected.services_requis" :key="value">{{value}}</div>
            </b-col>
          </b-row>
        </div>

          <router-link tag="b-button" class="float-right" :to="{ name: 'IHMExpert', params: { componentSelected: componentSelected } }">Construire l'application</router-link>
      </b-form>
    </b-card-text>
  </b-card>
</template>

<script>
export default {
  name: "IHMUtilisateur",
  data() {
    return {
      msg: "Welcome to Your Vue.js App",
      options: [
        {
          name: "C1",
          services_fournis: ["SF1", "SF2", "SF3"],
          services_requis: ["SR1", "SR2", "SR3"]
        },
        {
          name: "C2",
          services_fournis: ["SF11", "SF22", "SF33"],
          services_requis: ["SR11", "SR22", "SR33"]
        }
      ],
      componentSelected: ""
    };
  }
};
</script>
