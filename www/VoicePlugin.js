var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'VoicePlugin', 'coolMethod', [arg0]);
};

module.exports.sorter = function(arg0,success,error){
    exec(success,error,'VoicePlugin', 'sorter', [arg0]);
}

