window.onload = function () {
    var vue = new Vue({
        el: "#note",
        data: {
            noteList: {},
        },
        methods: {
            getNoteList: function () {
                axios({
                    method: "POST",
                    url: "note.do",
                    params: {
                        operate: "getNote"
                    }
                }).then(function (value) {
                    vue.noteList = value.data;
                }).catch(function (reason) {

                })
            }
        },
        beforeMount: function () {
            this.getNoteList();
        }
    })
}
