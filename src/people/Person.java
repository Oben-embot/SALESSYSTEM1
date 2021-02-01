package people;

public class Person{

        private String surname;
        private String lastName;
        private String dateOfBirth;
        private String emailAddress;
        private String race;
        private String gender;
        private String nationality;
        private long idNumber;


        public String getSurname(){
        return surname;
      }
        public void setSurname(String surname){
         this.surname = surname;
     }

       public String getLastName(){
        return lastName;
     }
       public void setLastName(String lastName){
        this.lastName = lastName;
     }

       public String getDateOfBirth(){
         return dateOfBirth;
      }
       public void setDateOfBirth(String dateOfBirth){
         this.dateOfBirth = dateOfBirth;
      }

       public String getEmailAddress(){
         return emailAddress;
      }
       public void setEmailAddress(String emailAddress){
         this.emailAddress = emailAddress;
      }

       public String getRace(){
        return race;
      }
       public void setRace(String race){
         this.race = race;
      }

       public String getGender(){
        return gender;
      }
        public void setGender(String gender){
         this.gender = gender;
      }

        public String getNationality(){
         return nationality;
      }
        public void setNationality(String nationality){
          this.nationality = nationality;
      }

         public long getIdNumber(){
          return idNumber;
      }
         public void setIdNumber(long idNumber){
          this.idNumber = idNumber;
      }

public Person(){
}

}
