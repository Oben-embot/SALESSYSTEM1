package store;

public class Store{
         private String name;
         private String address;
         private String cellPhoneNumber;
         private String emailAddress;
         private String workingHours;

              public String getName(){
                  return name;
         }
              public void setName(String name){
                   this.name = name;
         }

              public String getAddress(){
                 return address;
         }
              public void setAddress(String address){
                   this.address = address;
        }

              public String getCellPhoneNumber(){
                 return cellPhoneNumber;
        }
              public void setCellPhoneNumber(String cellPhoneNumber){
                  this.cellPhoneNumber = cellPhoneNumber;
        }

              public String getEmailAddress(){
                  return  emailAddress;
        }
              public void setEmailAddress(String emailAddress){
                 this.emailAddress = emailAddress;
        }

              public String getWorkingHours(){
                    return workingHours;
        }
              public void setWorkingHours(String workingHours){
                     this.workingHours = workingHours;
        }

             public Store(){
           }

}
