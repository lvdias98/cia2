"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[4851],{4851:(h,s,l)=>{l.r(s),l.d(s,{HomePageModule:()=>P});var p=l(6895),i=l(4556),r=l(433),g=l(2598),d=l(655),n=l(8256);const u=[{path:"",component:(()=>{class e{constructor(o,t){this.plt=o,this.loadingController=t,this.connection=!1,this.mac=""}connect(){return(0,d.mG)(this,void 0,void 0,function*(){const o=yield this.loadingController.create({message:"Conectando Bluetooth..."});yield o.present();const t=this.mac.split(":").join("").toUpperCase();SewooPrintApplay.start(t,c=>{console.log("\u{1f680} ~ resultStart",c),this.connection=!!c,o.dismiss(),alert("Conex\xe3o... "+JSON.stringify(c))})})}print(){return(0,d.mG)(this,void 0,void 0,function*(){const o=yield this.loadingController.create({message:"Printing..."});SewooPrintApplay.printText("Test",t=>{console.log("\u{1f680} ~ resultPrint",t),o.dismiss(),alert("Impress\xe3o... "+JSON.stringify(t))})})}copy(){navigator.clipboard.writeText("40192050237B")}}return e.\u0275fac=function(o){return new(o||e)(n.Y36(i.t4),n.Y36(i.HT))},e.\u0275cmp=n.Xpm({type:e,selectors:[["app-home"]],decls:28,vars:5,consts:[[3,"translucent","click"],[3,"fullscreen","click"],["collapse","condense"],["size","large"],["id","container"],[3,"click"],[1,"input"],["position","floating"],["placeholder","Enter text",3,"ngModel","ngModelChange"],[1,"buttons"],["expand","block",3,"disabled","click"]],template:function(o,t){1&o&&(n.TgZ(0,"ion-header",0),n.NdJ("click",function(){return t.copy()}),n.TgZ(1,"ion-toolbar")(2,"ion-title"),n._uU(3," Test "),n.qZA()()(),n.TgZ(4,"ion-content",1),n.NdJ("click",function(){return t.copy()}),n.TgZ(5,"ion-header",2)(6,"ion-toolbar")(7,"ion-title",3),n._uU(8,"Blank"),n.qZA()()(),n.TgZ(9,"div",4)(10,"strong",5),n.NdJ("click",function(){return t.copy()}),n._uU(11,"Test print application"),n.qZA(),n.TgZ(12,"p"),n._uU(13,"1 - Fill in mac address"),n.qZA(),n.TgZ(14,"p"),n._uU(15,"2 - Click connect BT"),n.qZA(),n.TgZ(16,"p"),n._uU(17,"3 - Click print test"),n.qZA(),n.TgZ(18,"div",6)(19,"ion-item")(20,"ion-label",7),n._uU(21,"MAC Address (Ex: 40192050237B)"),n.qZA(),n.TgZ(22,"ion-input",8),n.NdJ("ngModelChange",function(f){return t.mac=f}),n.qZA()()(),n.TgZ(23,"div",9)(24,"ion-button",10),n.NdJ("click",function(){return t.connect()}),n._uU(25,"Connect BT"),n.qZA(),n.TgZ(26,"ion-button",10),n.NdJ("click",function(){return t.print()}),n._uU(27,"Print Test"),n.qZA()()()()),2&o&&(n.Q6J("translucent",!0),n.xp6(4),n.Q6J("fullscreen",!0),n.xp6(18),n.Q6J("ngModel",t.mac),n.xp6(2),n.Q6J("disabled",0===t.mac.length),n.xp6(2),n.Q6J("disabled",!t.connection))},dependencies:[r.JJ,r.On,i.YG,i.W2,i.Gu,i.pK,i.Ie,i.Q$,i.wd,i.sr,i.j9],styles:["#container[_ngcontent-%COMP%]{text-align:center;position:absolute;left:0;right:0;top:50%;transform:translateY(-50%)}#container[_ngcontent-%COMP%]   strong[_ngcontent-%COMP%]{font-size:20px;line-height:26px}#container[_ngcontent-%COMP%]   p[_ngcontent-%COMP%]{font-size:16px;line-height:22px;color:#8c8c8c;margin:0}#container[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]{text-decoration:none}#container[_ngcontent-%COMP%]   .input[_ngcontent-%COMP%]{margin-top:32px;padding:16px}#container[_ngcontent-%COMP%]   .buttons[_ngcontent-%COMP%]{padding:16px}"]}),e})()}];let m=(()=>{class e{}return e.\u0275fac=function(o){return new(o||e)},e.\u0275mod=n.oAB({type:e}),e.\u0275inj=n.cJS({imports:[g.Bz.forChild(u),g.Bz]}),e})(),P=(()=>{class e{}return e.\u0275fac=function(o){return new(o||e)},e.\u0275mod=n.oAB({type:e}),e.\u0275inj=n.cJS({imports:[p.ez,r.u5,i.Pc,m]}),e})()}}]);