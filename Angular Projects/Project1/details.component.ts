import { Component } from "@angular/core";
@Component({
    selector:'app-details',
    templateUrl:'./details.component.html',
    styles: [
        `.log{
            color:white;
        }`
    ]
}

)
export class DetailsComponent{
    displayPara=false;
    btnClick  =[];

    TogglePara(event : Event){
        this.displayPara=!this.displayPara;
        this.btnClick.push(
                 this.btnClick.length
        );
        

    }
}