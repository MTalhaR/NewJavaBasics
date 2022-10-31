package replitTasks;
        /*Create a Person class with the following:
        **Class Variables**
        - firstname
        - lastname
        - birthmonth
        - birthday
        - birthyear
        - String ssn
        **Constructor**
        The main constructor should take in all values and assign them to their respective private class variables
        **Methods**
        Create a public getters to access all the variables.
        **Create a public method called formatBirthday, which will return a String composed of their birthday
        * in mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return
        * the String "3/22/2000"**
        in Main Class.
        Instantiate and object of Person and provide values. follows below outputs for values.
        using getter and method print them separately.*/
public class Task182Encapsulation {
        public static void main(String [] args){
                person obj=new person("John","Doe",10,25,1900,"123-45-6789");
                System.out.println(obj.getFirstname());
                System.out.println(obj.getLastname());
                obj.formatBirthday();
                System.out.println(obj.getSSN());
                }
}
class person{
        private String firstname;
        private String lastname;
        private int birthmonth;
        private int birthday;
        private int birthyear;
        private String ssn;
        person(String firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){
                this.firstname=firstname;
                this.lastname=lastname;
                this.birthmonth=birthmonth;
                this.birthday=birthday;
                this.birthyear=birthyear;
                this.ssn=ssn;
        }
        public String getFirstname(){
                return firstname;
        }
        public String getLastname(){
                return lastname;
        }
        public int getBirthmonth(){
                return birthmonth;
        }
        public int getBirthday(){
                return birthday;
        }
        public int getBirthyear(){
                return birthyear;
        }
        public String getSSN(){
                return ssn;
        }
        public String formatBirthday(){
                String BirthdayFormat="";
                System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
                return BirthdayFormat;
        }
}