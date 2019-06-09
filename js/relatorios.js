var mysql = require('mysql');

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "Guilherme@02",
    database: "CADPRO"
});

module.exports = con.connect(function (err) {
    if (err) throw err;
    console.log("Conectado ao banco!");
    // con.query("SELECT * FROM customers", function (err, result, fields) {
    //     if (err) throw err;
    //     console.log(result);
    // });
});