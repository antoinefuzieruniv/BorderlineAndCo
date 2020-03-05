<template>
  <b-card title="SCAA" img-alt="Image" tag="article" class="mx-auto w-50">
    <b-card-text>
      <b-form>
        <p>
          Composant choisi par l'utilisateur :
          <strong>{{componentSelectedByUser.name}}</strong>
        </p>
        <div class="h-25 m-5 border border-dark rounded p-3" v-if="componentSelectedByUser">
          <b-row>
            <b-col class="border-right">
              <p>Services fournis :</p>
              <div v-for="value in componentSelectedByUser.services_fournis" :key="value">{{value}}</div>
            </b-col>
            <b-col>
              <p>Services requis :</p>
              <div v-for="value in componentSelectedByUser.services_requis" :key="value">{{value}}</div>
            </b-col>
          </b-row>
        </div>

        <b-form-group
          id="input-group-4"
          class="w-50 mx-auto mb-5"
          label="Liste des connexions possibles:"
          label-for="input-4"
        >
          <b-form-select id="input-4" v-model="componentSelectedByExpert" required>
            <b-form-select-option
              v-for="(value, index) in options"
              :value="value"
              :key="index"
            >{{value.name}}</b-form-select-option>
          </b-form-select>
        </b-form-group>

        <div class="h-25 m-5 border border-dark rounded p-3" v-if="componentSelectedByExpert">
          <b-row>
            <b-col class="border-right">
              <p>Services fournis :</p>
              <div
                v-for="value in componentSelectedByExpert.services_fournis"
                :key="value"
              >{{value}}</div>
            </b-col>
            <b-col>
              <p>Services requis :</p>
              <div v-for="value in componentSelectedByExpert.services_requis" :key="value">{{value}}</div>
            </b-col>
          </b-row>
        </div>

        <router-link
          tag="b-button"
          class="float-right"
          :to="{ name: 'IHMExpert', params: { componentSelected: componentSelected } }"
        >Choisir</router-link>


        <b-form-checkbox
          id="checkbox-1"
          v-model="saveChoice"
          name="checkbox-1"
        >Conserver mon choix</b-form-checkbox>
      </b-form>
    </b-card-text>
  </b-card>
</template>

<script>
export default {
  name: "IMHExpert",
  created() {
    this.componentSelectedByUser = this.$route.params.componentSelected;
  },
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
      componentSelectedByUser: "",
      componentSelectedByExpert: "",
      saveChoice : false
    };
  }
};
</script>

<style>
</style>