import { Component } from "@angular/core";
@Component({
    selector:'app-username',
    templateUrl:  './username.component.html'

})
export class UserNameComponent{
    userName='';
   
    activateBtn(){
        if (this.userName!='')
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    resetUserName(event : Event){
        this.userName='';
    }

}