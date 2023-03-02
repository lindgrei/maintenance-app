<template>
  <div class = "container">

    <button onclick="location.href = 'oo.html';" id="myButton" class="float-left submit-button" >Home</button>

  </div>
</template>

<script>
export default {
  name: "AddButton",
  data() {
    return {
      showForm: false,
      formData: {}, // form data will be stored here
    };
  },
  methods: {
    onSubmit() {
      // submit form data to API
      // you can use an HTTP library like axios to make the API request
      // and update the formData object with the response data
    },
  },
};
</script>
