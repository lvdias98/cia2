cordova.define("cordova-plugin-sewooprintapplay.SewooPrintApplay", function(require, exports, module) {
var exec = require('cordova/exec');

var PLUGIN_NAME = 'SewooPrintApplay';

var SewooPrintApplay = {};

SewooPrintApplay.echoTest = (string, callback)=>{
    exec((texto)=>callback(texto), (error)=>callback(null,error), PLUGIN_NAME, 'echoTest', [string]);
};

SewooPrintApplay.start = (addr, callback)=>{
    exec((texto)=>callback(texto), (error)=>callback(null,error), PLUGIN_NAME, 'start', [addr]);
};

SewooPrintApplay.printText = (textInput,callback)=>{
    exec((texto)=>callback(texto), (error)=>callback(null,error), PLUGIN_NAME, 'print', [textInput]);
};

module.exports = SewooPrintApplay;

});
