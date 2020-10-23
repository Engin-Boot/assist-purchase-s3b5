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

  viewall(){
    let observableStream=this.httpClient.get(`${this.baseUrl}/viewall`);
    return observableStream;
  }
  addProduct(req){
    let observableStream=this.httpClient.post(`${this.baseUrl}/addproduct`,req);
    return observableStream;
  }
}
