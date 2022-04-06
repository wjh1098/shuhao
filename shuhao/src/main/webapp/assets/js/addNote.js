var Arr = ["i1.jpg", "i2.jpg", "i3.jpg", "i4.jpg"];
var vue = new Vue({
    el: "#form",
    data: {
        noteTitle: "",
        noteDesc: "",
        noteImg: Arr[Math.floor(Math.random() * Arr.length + 1) - 1],
        noteKind: "- 分类 -",
        noteDetail: "",
    },
    methods: {
        addNote: function () {
            axios({
                method: "POST",
                url: "note.do?operate=addNote",
                data: {
                    noteTitle: this.noteTitle,
                    noteImg: this.noteImg,
                    noteDesc: this.noteDesc,
                    noteKind: this.noteKind,
                    noteDetail: this.noteDetail,
                }
            }).then(function (value) {
                window.location.href = "page.do?operate=page&page=index"
            }).catch(function (reason) {
            })
        }
    }
})


