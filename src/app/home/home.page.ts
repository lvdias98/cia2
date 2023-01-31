import { Component } from '@angular/core';
import { Platform, LoadingController } from '@ionic/angular';

declare var SewooPrintApplay:any;

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  connection:boolean = false;
  mac:string = '';

  constructor(
    public plt: Platform,
    public loadingController: LoadingController
  ) {}

  async connect() {
    const loading = await this.loadingController.create({
      message: 'Conectando Bluetooth...',
    });

    await loading.present();

    //mac address
    const printerMacAddress:any = this.mac.split(':').join('').toUpperCase();
    // const printerMacAddress = "40192050237B";

    //responsible for connecting bluetooth
    SewooPrintApplay.start(printerMacAddress,(resultStart:any) => {
      console.log("🚀 ~ resultStart", resultStart);
      this.connection = !!resultStart;
      loading.dismiss();
      alert('Conexão... '+JSON.stringify(resultStart));
    });
  }

  async print() {
    const loading = await this.loadingController.create({
      message: 'Printing...',
    });

    //responsible for sending impression
    SewooPrintApplay.printText("Test",(resultPrint:any) => {
      console.log("🚀 ~ resultPrint", resultPrint)
      loading.dismiss();
      alert('Impressão... '+JSON.stringify(resultPrint));
    });
  }

  copy() {
    navigator.clipboard.writeText("40192050237B");
  }
}
