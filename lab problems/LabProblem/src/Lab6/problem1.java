
package Lab6;
import java.util.ArrayList;
import java.util.Scanner;


class student{
int stdid;
String stdName;
double stdCG;
ArrayList<course> courseList =new ArrayList<>();

student(){
    
}
student(int id,String name,double cg){
    stdid=id;
    stdName=name;
    stdCG=cg;
    
}

void Display(){
    System.out.println("Student id:"+stdid+" Student Name: "+stdName+" CGPA : "+stdCG);
}
void printCourseList(){
       for (int i = 0; i < courseList.size(); i++) {
           courseList.get(i).Display();
       }
   
   }
}




class faculty{
  int facultyid;
  String facultyName;
  String facultyPosition;
  ArrayList<course> courseList =new ArrayList<>();
  faculty(){
      
  }
  faculty(int id,String name,String posi){
      facultyid=id;
      facultyName=name;
      facultyPosition=posi;

  }    
  void Display(){
      System.out.println("faculty id:"+facultyid+" faculty Name: "+facultyName+" position : "+facultyPosition);
  }
  void printCourseList(){
       for (int i = 0; i <courseList.size(); i++) {
           courseList.get(i).Display();
       }
   
   }
  
}




class course{
    String Cid;
    String Ctitle;
    double credit;
    ArrayList<student> studentList=new ArrayList< >();
    faculty fac;
    
    course(){
        
    }
    
    course(String id,String title,Double c){
     Cid=id;
     Ctitle=title;
     credit=c;
    }
    
    void addStudent(student s){
        studentList.add(s);
    }
    void dropStudent(student s){
        studentList.remove(s);
    }
    void addFaculty(faculty f){
        fac=f;
    }
    void dropFaculty(){
        fac=null;
    }
   void Display(){
     System.out.println("Course id:"+Cid+" Course title: "+Ctitle+" Credit : "+credit);
}
   void printStudentList(){
       for (int i = 0; i < studentList.size(); i++) {
           studentList.get(i).Display();
       }
   
   }
   
}



public class problem1 {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
    ArrayList<student> s= new ArrayList<>();
    ArrayList<course> c= new ArrayList<>();
    ArrayList<faculty> f= new ArrayList<>();

    
    while(1>0){
        System.out.println("1.Add\n2.Delete\n3.Update\n4.Print\n5.Search\n6.exit");

        int n=inp.nextInt();
        if(n==6){
            break;
        }
        else if(n==1){
        System.out.println("1.Add a student\n2.Add a Course\n3.Add a Faculty");
        int m=inp.nextInt();
        if(m==1){
            System.out.println("Enter student ID,name,CGPA: ");
            int id=inp.nextInt();
            String name=inp.next();
            double cgpa=inp.nextDouble();
            
            student s1=new student(id,name,cgpa);
            s.add(s1);            
        }
        if(m==2){
            System.out.println("Enter course ID,Title ,credit: ");
            String id=inp.next();
            String title=inp.next();
            double credit=inp.nextDouble();
            
            course c1=new course(id,title,credit);
            c.add(c1);            
        }
         if(m==3){
            System.out.println("Enter faculty ID,name ,position: ");
            int id=inp.nextInt();
            String name=inp.next();
            String posi=inp.next();
            
            faculty f1=new faculty(id,name,posi);
            f.add(f1);            
        }
        
        }
        else if(n==2)
            {
        System.out.println("1.Delete a student\n2.Delete a Course\n3.Delete a Faculty");
         int m=inp.nextInt();
        if(m==1){
            System.out.println("Enter the student id to delete");
            int a=inp.nextInt();
            for (int i = 0; i < s.size(); i++) {
                if(a==s.get(i).stdid){
                    s.remove(s.get(i));
                }
            }
        } 
        else if(m==2){
            System.out.println("Enter the course id to delete");
            String a=inp.next();
            for (int i = 0; i < c.size(); i++) {
                if(a.equals(c.get(i).Cid)){
                    c.remove(c.get(i));
                }
            }
        }
        else if(m==3){
            System.out.println("Enter the faculty id to delete");
            int a=inp.nextInt();
            for (int i = 0; i < f.size(); i++) {
                if(a==f.get(i).facultyid){
                    f.remove(f.get(i));
                }
            }
        }
        
        }
        else if(n==3)
            {
        System.out.println("1.Update a student\n2.Update a Course\n3.Update a Faculty");
        int m=inp.nextInt();
        if(m==1){
            System.out.println("1.Add course to a student\n2.remove course from a student");
            int o=inp.nextInt();
            if(o==1){
                System.out.println("Enter student id and course id");
             int a=inp.nextInt();
             String b=inp.next();
             course c1=new course();
                for (int i = 0; i < c.size(); i++) {
                    if(b==c.get(i).Cid)
                    c1= c.get(i);
                }
             for (int i = 0; i < s.size(); i++) {
                 if (a==s.get(i).stdid) {
                     s.get(i).courseList.add(c1);
                     c1.addStudent(s.get(i));
                 }
 
             }
             
            }
            else if(o==2){
                 System.out.println("Enter student id and course id");
             int a=inp.nextInt();
             String b=inp.next();
             course c1=new course();
                for (int i = 0; i < c.size(); i++) {
                    if(b==c.get(i).Cid)
                    c1= c.get(i);
                }
             for (int i = 0; i < s.size(); i++) {
                 if (a==s.get(i).stdid) {
                     s.get(i).courseList.remove(c1);
                     c1.dropStudent(s.get(i));
                 }
 
             }    
            }
        }
        else if(m==2){
            System.out.println("1.Add student to a course\n2.remove student from a course\n3.Add faculty to a course\n4.remove faculty from a course");
            int o=inp.nextInt();
            if(o==1){
                  System.out.println("Enter student id and course id");
             int a=inp.nextInt();
             String b=inp.next();
             student s1=new student();
                for (int i = 0; i < s.size(); i++) {
                    if(a==s.get(i).stdid)
                    s1= s.get(i);
                }
             for (int i = 0; i < c.size(); i++) {
                 if (b==c.get(i).Cid) {
                     c.get(i).studentList.add(s1);
                     s1.courseList.add(c.get(i));
                 }
 
             }   
            }
            else if(o==2){
                     System.out.println("Enter student id and course id");
             int a=inp.nextInt();
             String b=inp.next();
             student s1=new student();
                for (int i = 0; i < s.size(); i++) {
                    if(a==s.get(i).stdid)
                    s1= s.get(i);
                }
             for (int i = 0; i < c.size(); i++) {
                 if (b==c.get(i).Cid) {
                     c.get(i).studentList.remove(s1);
                     s1.courseList.remove(c.get(i));
                 }
 
             } 
            }if(o==3){
              System.out.println("Enter faculty id and course id");
              int a=inp.nextInt();
             String b=inp.next();
             faculty f1=new faculty();
                for (int i = 0; i < f.size(); i++) {
                    if(a==f.get(i).facultyid)
                    f1= f.get(i);
                }
                for (int i = 0; i < c.size(); i++) {
                  if (b==c.get(i).Cid) {
                  c.get(i).addFaculty(f1);
                  f1.courseList.add(c.get(i));
                 }  
                }
             
            }
            else if(o==4){
              System.out.println("Enter faculty id and course id");
              int a=inp.nextInt();
             String b=inp.next();
             faculty f1=new faculty();
                for (int i = 0; i < f.size(); i++) {
                    if(a==f.get(i).facultyid)
                    f1= f.get(i);
                }
                for (int i = 0; i < c.size(); i++) {
                  if (b==c.get(i).Cid) {
                  c.get(i).dropFaculty();
                  f1.courseList.remove(c.get(i));
                 }  
                }  
            }
            
        }
        else if(m==3){
          System.out.println("1.Add course to a faculty\n2.remove course from a faculty");
            int o=inp.nextInt();
            if(o==1){
              System.out.println("Enter faculty id and course id");
             int a=inp.nextInt();
             String b=inp.next();
             course c1=new course();
                for (int i = 0; i < c.size(); i++) {
                    if(b==c.get(i).Cid)
                    c1= c.get(i);
                }
             for (int i = 0; i < f.size(); i++) {
                 if (a==f.get(i).facultyid) {
                     f.get(i).courseList.add(c1);
                     c1.addFaculty(f.get(i));
                 }
 
             }
             
            }
            else if(o==2){
               System.out.println("Enter faculty id and course id");
             int a=inp.nextInt();
             String b=inp.next();
             course c1=new course();
                for (int i = 0; i < c.size(); i++) {
                    if(b==c.get(i).Cid)
                    c1= c.get(i);
                }
             for (int i = 0; i < f.size(); i++) {
                 if (a==f.get(i).facultyid) {
                     f.get(i).courseList.remove(c1);
                     c1.dropFaculty();
                 }
 
             }  
            }
        }
        }
        else if(n==4)
            {
        System.out.println("1.Print all students\n2.Print all courses\n3.Print all faculties\n4.print information of a student\n5.print information of a course\n6.print information of a faculty\n7.print student list and faculty informtion of a course\n8.print courses taken by a student");
         int m=inp.nextInt();
        if(m==1){
            for (int i = 0; i < s.size(); i++) {
                s.get(i).Display();
            }
        }

        else if(m==2)
            {
            for (int i = 0; i < c.size(); i++) {
                c.get(i).Display();
            }
        }
        else if(m==3)
            {
            for (int i = 0; i < f.size(); i++) {
                f.get(i).Display();
            }
        }
        else if(m==4)
        {
            System.out.println("Enter the id of student to print");
            int nm=inp.nextInt();
            for (int i = 0; i < s.size(); i++) {
                if(nm==s.get(i).stdid){
                    s.get(i).Display();
                }
            }
            
        }
        else if(m==5)
        {
            System.out.println("Enter the id of course to print");
            String nm=inp.next();
            for (int i = 0; i < c.size(); i++) {
                if(nm.equals(c.get(i).Cid)){
                    c.get(i).Display();
                }
            }
            
        }
        else if(m==6)
        {
            System.out.println("Enter the id of faculty to print");
            int nm=inp.nextInt();
            for (int i = 0; i < f.size(); i++) {
                if(nm==f.get(i).facultyid){
                    f.get(i).Display();
                }
            }
            
        }
        else if(m==7)
        {
            System.out.println("Enter the id of course to search");
            String nm=inp.next();
            for (int i = 0; i < c.size(); i++) {
                if(nm.equals(c.get(i).Cid)){
                    c.get(i).printStudentList();
                    System.out.println(c.get(i).fac);
                }
            }
        }
        else if(m==8){
           System.out.println("Enter the student id");
            int nm=inp.nextInt();
            for (int i = 0; i < s.size(); i++) {
                if(nm==s.get(i).stdid){
                    s.get(i).printCourseList();
                }
            }  
        }
                                
        }
        else if(n==5)
        {
            System.out.println("1.Search a students\n2.Search a courses\n3.Search a faculty\n4.Search whether a student takes a course\n5.Search whether a faculty teaches a course\n6.Search courses taken by a student\n7.Search courses taught by a faculty");
         int m=inp.nextInt();
         if(m==1){
             System.out.println("Enter student id to search");
             int a=inp.nextInt();
             for (int i = 0; i < s.size(); i++) {
                 if(a==s.get(i).stdid){
                     System.out.println("Student found");
                 s.get(i).Display();
                 }
             }
         }
         else if(m==2){
            System.out.println("Enter course id to search");
             String a=inp.next();
             for (int i = 0; i < c.size(); i++) {
                 if(a.equals(c.get(i).Cid)){
                     System.out.println("Course found");
                 c.get(i).Display();
                 }
             } 
         }
         else if(m==3){
             System.out.println("Enter faculty id to search");
             int a=inp.nextInt();
             for (int i = 0; i < f.size(); i++) {
                 if(a==f.get(i).facultyid){
                     System.out.println("Faculty found");
                 f.get(i).Display();
                 }
             }
         }
         else if(m==4){
             System.out.println("Enter student id and course id");
             int a=inp.nextInt();
             String b=inp.next();
             for (int i = 0; i < s.size(); i++) {
                 if (a==s.get(i).stdid) {
                     student ss=s.get(i);
                     for (int j = 0; j < ss.courseList.size(); j++) {
                         if(b.equals(ss.courseList.get(j)))
                             System.out.println("this student has taken this course");
                     }
                 }
 
             }            
         }
         else if(m==5){
             System.out.println("Enter faculty id and course id");
             String a=inp.next();
             String b=inp.next();
             for (int i = 0; i < c.size(); i++) {
                 if(b.equals(c.get(i).fac))
                     System.out.println("This faculty teaches this course");
             }
         }
         else if(m==6){
          System.out.println("Enter student id to search");
             int a=inp.nextInt();
             for (int i = 0; i < s.size(); i++) {
                 if(a==s.get(i).stdid){
                 s.get(i).printCourseList();
                 }
             }   
         }
         else if(m==7){
            System.out.println("Enter faculty id to search");
             int a=inp.nextInt();
             for (int i = 0; i < f.size(); i++) {
                 if(a==f.get(i).facultyid){
                 f.get(i).printCourseList();
                 }
             } 
         }
        }   
    }    
    }
}