package people;

import goods.Product;

public class Suplier extends Person{

       private String logo;
       private String cellPhoneNumber;
       Product product;

 public Suplier(){
  }
         public  String getLogot(){
          return logo;
        }
         public void setLogo(String logo){
          this.logo = logo;
       }

        public String cellPhoneNumber(){
          return cellPhoneNumber;
       }
        public void setCellPhoneNumber(String cellPhoneNumber){
         this.cellPhoneNumber = cellPhoneNumber;
       }

       
}
