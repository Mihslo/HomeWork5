package gb.HomeWorkApp4;

public class Work {
    private String fullName;
    private String  position;
    private String  email;
    private String  phone;
    private int salory;
    private int age;


    public  Work (String fullName,String position,String phone,String email,int salory,int age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salory=salory;
        this.age=age;
    }
     public void printInfo(){
     System.out.printf("Work %s, fullNave:%s ,posititon:%s, email:%d,phone:%s,saloru:%d,age,%d\n",
          this.fullName,
           this.position,
             this.email,
             this.phone,
             this.salory,
             this.age);
     }
    public int getAge(){return this.age;}
    @Override
    public String toString(){
    return "Work{;"+"fullName"+fullName+'\''+
          ",position"+position+'\''+
          ",email"+email+'\''+
          ",phone"+phone+'\''+
          ",salory"+salory+'\''+
          ",age"+age+"}";
    }

    public static void main(String[] args) {
        Work [] works={
                new Work("Ivanov I I","Work","+4848484","wdwdqw@dwd",522200,37),
                new Work("Sidr K.M","Work2","+8468684484","ghthrt@ff",55355,54 ),
                new Work("Vladf M.M","Programmer","+4779767","effswf@dd",868866,65),
                new Work("Fil K.L","Gamer","+48988864","dasdasd@ddf",85565443,55),
                new Work("Klimov L.V","gamer2","+55665412","fafaef@uy",565458554,39),
        };
        for(Work work:works) {
            if (work.getAge() < 40) work.printInfo();
        }

    }
}
