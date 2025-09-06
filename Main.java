public class Main {

    //I added dummy info for the first 5 since this is a public Git
    public static void main(String[] args) {
        StudentApiClient api = new StudentApiClient();
        try {
            Student student = new Student(
                "jrw44",                         
                "Jonathan",                        
                "Walpow",                      
                "jwalp",                     
                "Ninja33910",                   
                "Gravity Falls",   
                "Java",                         
                "Splatoon",                    
                "103"                           
            );


            api.addStudent(student.toString());
            
            api.getStudent("jrw44", "103");

            api.updateStudent(student.toString());
            
            api.deleteStudent("jrw44", "103");

        } catch (Exception g) {
            g.printStackTrace();
        }
    }
}

//GPT interaction: https://chatgpt.com/share/68bb97dc-ab04-8008-8a99-384776f815aa