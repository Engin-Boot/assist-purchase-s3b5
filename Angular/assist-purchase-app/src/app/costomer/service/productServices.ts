import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';

@Injectable()
export class ProductService{

  httpClient:HttpClient;
  baseUrl:string;
  constructor(httpClient:HttpClient,@Inject('apiBaseAddress')baseUrl:string){
    this.httpClient=httpClient;
    this.baseUrl=baseUrl;
  }

  sendMail(req){
    let observableStream=this.httpClient.post(`${this.baseUrl}/send`,req);
    return observableStream;
  }
}
