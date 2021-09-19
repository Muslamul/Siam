
package nwu.chatbot;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;


public class BotInterface extends javax.swing.JFrame {
    HashMap<String, String> knowledge = new HashMap<String,String>();
    
    String name=showInputDialog(null,"Enter your name: ","Login",-1);
   
    public BotInterface() {
        
        initComponents();
        
          if (name.contains("Siam") || name.contains("Shopno") || name.contains("siam") || name.contains("shopno")){
           chatarea.append("Bot : Hi,my developer "+name+", tell me how can I help you?\n\n");
        }
        else if(name.contains("Irin")||name.contains("irin")) {
            chatarea.append("Bot : Hi, CR "+name+",your ID is 17 I know now tell me how can I help you ?\n\n");
        }
        else{
            chatarea.append("Bot : Hi,"+name+". I am SP20 related ChatBot. Try not to ask debris question !\n\n");
        }
      
        //greetings
        knowledge.put("Hi", "Hello"); 
        knowledge.put("hello", "Hi there !!");
        knowledge.put("hey", "Hey,Whats up ??");
        knowledge.put("hey", "Hey,How are you??");
        knowledge.put("I am fine", "Good to hear. Always wear MASK !!");
        knowledge.put("I am good", "Good to hear. Always wear MASK !!");
        knowledge.put("I am well", "Good to hear. Always wear MASK !!");
        knowledge.put("How are you?", "Not too bad , What about YOU??");
        knowledge.put("whats your name?","My creator Shopno called me ChatBot,Who are you?" );
        knowledge.put("what is your name?","I am Robot,Who are you?" );
        knowledge.put("I am "+name,"Nice to meet you");
        knowledge.put("Thanks","You are Most Welcome "+name);
        knowledge.put("Thank you","You are Most Welcome "+name);
        knowledge.put("Bye", "I feel lost. I wish we shall meet again,Bye");
        knowledge.put("ok Bye", "I feel lost. I wish we shall meet again,Bye");
        knowledge.put("Good bye", "I wish we shall meet again,Bye");
        knowledge.put("right","Hmm. Please continue");
        knowledge.put("yes","hmm. I see");
        
        //General talk to bot
        knowledge.put("Do you sleep?","Yes,Now I am sleepy");
        knowledge.put("are you hungry?","I dont eat but someday I will eat your brain !!");
        knowledge.put("do you eat?","I dont eat but someday I will eat your brain !!");
        knowledge.put("what are you doing?", "I am sleepy");
        knowledge.put("suggest me a movie","Watch Triangle");
        knowledge.put("Movie?","Watch Triangle");
        knowledge.put("suggest me a series","Vikings. I am fan of Ragnar Lothbroke");
        knowledge.put("Series?","Vikings");
        knowledge.put("Who is Ragnar lothbroke?","The famous vikings");
        
        //people intro
        knowledge.put("What do you know about Raihan sir","M.Raihan sir is a very Kind and Honest person and such a nice Teacher");
        knowledge.put("do you know Raihan sir","M.Raihan sir is a very Kind and Honest person and such a nice Teacher");
        
        knowledge.put("do you know my mom","Yes,Rahima Akter I know her she is a Beautiful mother");
        knowledge.put("","");
        knowledge.put("How do you know me?", "Who doesnt know you? "+name+" you are famous");
        knowledge.put("Do you know me?", "Who doesnt know you? "+name+" you are famous.");
        knowledge.put("Do you know irin","Who Doesnt know Irin Id:04? My creator told me she is a great CR after all");
        knowledge.put("Do you know asif jalil?","Ohh yeah,I know him..He is a famous Web developer if I am not wrong");
        knowledge.put("Do you know Neeloy?","You mean the Posh kid Abraar?Lives in sheikhpara");
        knowledge.put("Do you know Tunazzina?","Tunazzina Islam is your Loved one and You call her Chondrima");
        knowledge.put("","");
        //basic info
        knowledge.put("NWU related info","OK there, North Western University, Khulna the first full-fledged private university in Khulna, University was\n       established on 18 November 2012.");
        knowledge.put("NWU details","OK there, North Western University, Khulna the first full-fledged private university in Khulna, University was\n       established on 18 November 2012.");
        knowledge.put("NWU info","OK there, North Western University, Khulna the first full-fledged private university in Khulna, University was\n       established on 18 November 2012.");
        knowledge.put ("Northwestern University" , " NorthWestern University is one of the promising higher education  private university \n      in khulna District. it has two separte building for both B.B.A, law, english & another\n      one is for engineering faculty students. CSE, ECE, CIVIL, EEE are the running\n      engineering courses for a student can apply to take education knowledge.");
        knowledge.put ("Northwestern University details" , " NorthWestern University is one of the promising higher education  private university \n      in khulna District. it has two separte building for both B.B.A, law, english & another\n      one is for engineering faculty students. CSE, ECE, CIVIL, EEE are the running\n      engineering courses for a student can apply to take education knowledge.");
        
        
        //location
        knowledge.put("Location?","The University is on 236, M.A Bari Road, Khulna 9100.");
        knowledge.put("where is nwu situated?","The University is on 236, M.A Bari Road, Khulna 9100.");
        knowledge.put("nwu location?","The University is on 236, M.A Bari Road, Khulna 9100.");
        knowledge.put("nwu address?","The University is on 236, M.A Bari Road, Khulna 9100.");
        knowledge.put("Science building?","Tetul Tola more,Khulna");
        knowledge.put("where is Science building?","Tetul Tola more,Khulna");
        knowledge.put("Science campus?","Tetul Tola more,Khulna");
        knowledge.put("Science campus location?","Tetul Tola more,Khulna");
        knowledge.put("BBA building?","236, M.A. Bari Road, Sonadanga, Khulna-9100");
        knowledge.put("BBA building location?","236, M.A. Bari Road, Sonadanga, Khulna-9100");
        knowledge.put("BBA Campus?","236, M.A. Bari Road, Sonadanga, Khulna-9100");
        knowledge.put("where is BBA building?","236, M.A. Bari Road, Sonadanga, Khulna-9100");
        //NWU contact
        knowledge.put("Contact number?","+880-2477-726064-6,+880-1755-226611,+880-1786-480779");
        knowledge.put("NWU website","www.nwu.edu.bd");
        knowledge.put("NWU email"," info@nwu.edu.bd");
        //offered Courses
        knowledge.put("Faculty","1.Science and Technology,2.Business studies,3.Liberal arts and Human Science,4.Social Studies,5.Health Science");
        knowledge.put("how many Faculty in nwu","1.Science and Technology,2.Business studies,3.Liberal arts and Human Science,4.Social Studies,5.Health Science");
        knowledge.put("offered courses?","1.CSE\n2.EEE\n3.CE\n4.BBA\n5.EMBA\n6.LLB\n7.English\n9.MDS");
        knowledge.put("Course in NWU","1.CSE\n2.EEE\n3.CE\n4.BBA\n5.EMBA\n6.LLB\n7.English\n9.MDS");
        knowledge.put("nwu offer courses","1.CSE\n2.EEE\n3.CE\n4.BBA\n5.EMBA\n6.LLB\n7.English\n9.MDS");
        knowledge.put("how many course nwu offer","1.CSE\n2.EEE\n3.CE\n4.BBA\n5.EMBA\n6.LLB\n7.English\n9.MDS");
        //teacher
        knowledge.put("Techer info","There are a lot of reputed Teacher in NWU,Whose info do you want to know?");
        knowledge.put("Techer in NWU","There are a lot reputed of Teacher in NWU,Whose info do you want to know?");
        knowledge.put("how many teacher in nwu","There are a lot of reputed Teacher in NWU,Whose info do you want to know?");
        knowledge.put("Techer","There are a lot of reputed Teacher in NWU,Whose info do you want to know?");
        knowledge.put("Tajul Islam","Name: Tajul Islam Designation: Senior Lecturer(Dept.Head Of CSE) Email:tajulkuet09@gmail.com \n         Mobile: +880-1952303940 ");
        knowledge.put("Md Inzamam hossain", "Name: Md.Inzamam-Ul-Hossain Designation: Assistant Professor Email: cse.inzamam@yahoo.com \n      Mobile: +880-1920440044");
        knowledge.put("Zahrul Jannat Peya","Name: Zahrul Jannat Peya Designation: Assistant Professor Email:  jannat.ruet@yahoo.com , jannat@nwu.edu.bd (off.)\n      Mobile: +880-1745885080");
        knowledge.put("Soniya Yeasmin","Name: Soniya Yeasmin Designation: Lecturer Email: soniya.cse08@gmail.com , s.yeasmin@nwu.edu.bd (off.)\n      Mobile: +880-1683371171");
        knowledge.put("Nagib Mahfuz","Name: Nagib Mahfuz Designation: Lecturer Email: ren3336@gmail.com , n.mahfuz@nwu.edu.bd (off.)\n      Mobile: +880-1764699589");
        knowledge.put("Nazia Farah","Name: Nazia Farah Designation: Lecturer Email: nazia.farah31@gmail.com , nazia.farah@nwu.edu.bd (off.)\n      Mobile: +880-1981112221");
        knowledge.put("Sajib Chatterjee","Name: Sajib Chatterjee Designation: Lecturer Email: sajib.ku.cse12@gmail.com , sajibc@nwu.edu.bd (off.)\n      Mobile: +880-1943518921");
        knowledge.put("Md Mahedi Hasan","Name: Md. Mahedi Hasan Designation: Lecturer Email: mdmahedihasan76@gmail.com , smahedi@nwu.edu.bd (off.)\n      Mobile: +880-1714615916");
        knowledge.put("Nurzahan Akter Joly","Name: Nurzahan Akter Joly Designation: Lecturer Email: jahanjolly.kucse11@gmail.com , jahanjolly@nwu.edu.bd (off.)\n      Mobile: +880-1912084444");
        knowledge.put("M Raihan","Name: M. Raihan Designation: Lecturer Email: rianku11@gmail.com , mraihan@nwu.edu.bd (off.)\n      Mobile: +880-1714070902");
        knowledge.put("Nasif Alvi","Name: Nasif Alvi Designation: Lecturer Email: nasif.cse12@gmail.com , nasifalvi@nwu.edu.bd (off.)\n      Mobile: +880-1915898583");
        knowledge.put("Md Asaduzzaman","Name: Md. Asaduzzaman Designation: Assistant Professor spandan.ku@gmail.com , asad_zaman@nwu.edu.bd (off.)\n      Mobile: +880-1734638383");
        knowledge.put("Mahmudul Hasan Milon","Name: Mahmudul Hasan Milon Designation: Senior Lecturer Email: mahamudulmilon@yahoo.com, mahamudulmilon@nwu.edu.bd (off.)\n      Mobile: +880-1719684520");
        knowledge.put("Mohiuddin Ahmed","Name: Mohiuddin Ahmed Designation: Senior Lecturer Email: mohiuddin06@gmail.com\n      Mobile: +880-1914168928");
        knowledge.put("Md Ashik Iqbal","Name: Md. Ashik Iqbal Designation: Lecturer Mobile: +880-1719900645");
        knowledge.put("Helal Uddin","Name: Md. Helal Uddin Designation: Lab Assistant(CSE) Phone: +880-2477-730596 Mobile: +880-1924885560");
        knowledge.put("Kazi Md Khalilullah","Name: Kazi Md. Khalilullah Designation: Lab Assistant(CSE) Phone: +880-2477-730596 Mobile: +880-1818636407");                       
        //sp20 students
        knowledge.put("students in sp20","There are 125 students in SP20 semester");
        knowledge.put("how many students in sp20","There are 125 students in SP20 semester");
        knowledge.put("students in a section","There are 30 students in SP20 semester");
        knowledge.put("how many students in section a?","There are 125 students in SP20 semester");        
        //class
        knowledge.put("","");
        knowledge.put("All class routine","Monday: 8.00-10.30AM-CSE(2202)-Algorithm Lab-Zahrul Jannat\n              10.45-1.15PM-CSE(2204)-Soft. Dev Sessional-M.Raihan\n              2.00-3.15PM-MATH(2231)-Mathematics-Md.Milon\n     Tuesday: 9.15-1030AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-CSE(2201)-Algorithm-Zahrul Jannat\n              12.00-1.15PM-HUM(2241)-Economics-Tanvir sir\n   Wednesday: 8.009.15AM-CSE(2201)-Algorithm-Zahrul Jannat\n              9.15-10.30AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-MATH(2231)-Matthematics-Md.Milon");
        knowledge.put("class schedule","Monday: 8.00-10.30AM-CSE(2202)-Algorithm Lab-Zahrul Jannat\n              10.45-1.15PM-CSE(2204)-Soft. Dev Sessional-M.Raihan\n              2.00-3.15PM-MATH(2231)-Mathematics-Md.Milon\n     Tuesday: 9.15-1030AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-CSE(2201)-Algorithm-Zahrul Jannat\n              12.00-1.15PM-HUM(2241)-Economics-Tanvir sir\n   Wednesday: 8.009.15AM-CSE(2201)-Algorithm-Zahrul Jannat\n              9.15-10.30AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-MATH(2231)-Matthematics-Md.Milon");
        knowledge.put("Sp20 a class schedule routine","Monday: 8.00-10.30AM-CSE(2202)-Algorithm Lab-Zahrul Jannat\n              10.45-1.15PM-CSE(2204)-Soft. Dev Sessional-M.Raihan\n              2.00-3.15PM-MATH(2231)-Mathematics-Md.Milon\n     Tuesday: 9.15-1030AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-CSE(2201)-Algorithm-Zahrul Jannat\n              12.00-1.15PM-HUM(2241)-Economics-Tanvir sir\n   Wednesday: 8.009.15AM-CSE(2201)-Algorithm-Zahrul Jannat\n              9.15-10.30AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-MATH(2231)-Matthematics-Md.Milon");
        knowledge.put("Monday class routine schedule","Monday: 8.00-10.30AM-CSE(2202)-Algorithm Lab-Zahrul Jannat\n              10.45-1.15PM-CSE(2204)-Soft. Dev Sessional-M.Raihan\n              2.00-3.15PM-MATH(2231)-Mathematics-Md.Milon");
        knowledge.put("Tuesday class routine ","Tuesday: 9.15-1030AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-CSE(2201)-Algorithm-Zahrul Jannat\n              12.00-1.15PM-HUM(2241)-Economics-Tanvir sir");
        knowledge.put("Wednesday class routine ","Wednesday: 8.009.15AM-CSE(2201)-Algorithm-Zahrul Jannat\n              9.15-10.30AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-MATH(2231)-Matthematics-Md.Milon");
        knowledge.put("cse class routine","Monday: 8.00-10.30AM-CSE(2202)-Algorithm Lab-Zahrul Jannat\n              10.45-1.15PM-CSE(2204)-Soft. Dev Sessional-M.Raihan\n     Tuesday: 10.45-12.00PM-CSE(2201)-Algorithm-Zahrul Jannat\n   Wednesday: 8.009.15AM-CSE(2201)-Algorithm-Zahrul Jannat");
        knowledge.put("Math class routine","Monday: 2.00-3.15PM-MATH(2231)-Mathematics-Md.Milon\n     Tuesday: 9.15-1030AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n   Wednesday: 9.15-10.30AM-CSE(2205)-Discreate Math-Nagib Mahfuz\n              10.45-12.00PM-MATH(2231)-Matthematics-Md.Milon");
        knowledge.put("hum class  routine","Tuesday: 12.00-1.15PM-HUM(2241)-Economics-Tanvir sir");
        knowledge.put("hum routine","Tuesday: 12.00-1.15PM-HUM(2241)-Economics-Tanvir sir");
        knowledge.put("cse routine","Monday: 8.00-10.30AM-CSE(2202)-Algorithm Lab-Zahrul Jannat\n              10.45-1.15PM-CSE(2204)-Soft. Dev Sessional-M.Raihan\n     Tuesday: 10.45-12.00PM-CSE(2201)-Algorithm-Zahrul Jannat\n   Wednesday: 8.009.15AM-CSE(2201)-Algorithm-Zahrul Jannat");
        knowledge.put("course code","CSE-Algorithm-2201\n     CSE-Algorithm Lab-2202\n     CSE-Soft.Dev.Lab-2204\n     CSE-Discreate math-2205\n     MATHEMATICS-2231\n     HUM-Economics-2241");
        knowledge.put("class material","Search in Mega: \n     Email: info.cse.nwu.sp20@gmail.com Pass: NWUcsesp20");
        knowledge.put("class recording","Search in Mega: \n     Email: info.cse.nwu.sp20@gmail.com Pass: NWUcsesp20");
        knowledge.put("Economics classroom code","7hugtxl\n    Project Submission classroom code: 2zfvp6c");
        knowledge.put("hum classroom code","Class Material classroom code: 7hugtxl\n    Project Submission classroom code: 2zfvp6c");
        knowledge.put("Math classroom code","CT classrom code: wgaeoww");
        knowledge.put("cse classroom code","CSE-2201 classroom code: e6ymceo");
        knowledge.put("ct info","1. 14th Sep HUM-2241-Economics CT Chapter 5,6,7\n     2. 15th Sep MATH-2231 CT 7,8,9 no. PDF\n     3. 18th Sep CSE-2204 all project  material submission\n     4. 20th Sep HUM-2241-Economics project submission.\n     5. 20th Sep CSE-2201 Assignment topic:Matrix chain,Determine BFS & DFS,Difference between BFS & DFS");
        knowledge.put("ct details","1. 14th Sep HUM-2241-Economics CT Chapter 5,6,7\n     2. 15th Sep MATH-2231 CT 7,8,9 no. PDF\n     3. 18th Sep CSE-2204 all project  material submission\n     4. 20th Sep HUM-2241-Economics project submission.\n     5. 20th Sep CSE-2201 Assignment topic:Matrix chain,Determine BFS & DFS,Difference between BFS & DFS");
        knowledge.put("CSE 2204 info","Project File Submission:\n     1.Project report DOCS and PDF\n     2.Presentation+Presentation video(Both member should contribute equally)\n     Project SOURCE file\n     N.B: Put all the material in a folder and make the folder ZIP or .rar file. Folder name ex: 20201001010-20201068010");
        knowledge.put("2204 info","Project File Submission:\n     1.Project report DOCS and PDF\n     2.Presentation+Presentation video(Both member should contribute equally)\n     Project SOURCE file\n     N.B: Put all the material in a folder and make the folder ZIP or .rar file. Folder name ex: 20201001010-20201068010");
        knowledge.put("2201 info","20th Sep CSE-2201 Assignment topic:Matrix chain,Determine BFS & DFS,Difference between BFS & DFS");
        knowledge.put("2241 info","20th Sep HUM-2241-Economics project submission.\n     14th Sep HUM-2241-Economics CT Chapter 5,6,7");
        knowledge.put("2231 info","15th Sep MATH-2231 CT 7,8,9 no. PDF");
        knowledge.put("","");
        knowledge.put("","");
        
    }
    public void answer(String input){
        Set<String>keys = knowledge.keySet();
        
        for(String key : keys){
            String lowerkey = key.toLowerCase();
            String lowerquestion = input.toLowerCase();
            if (lowerkey.contains(lowerquestion)){               
                chatarea.append("Bot : "+knowledge.get(key)+ "\n\n"); 
                
                
                return;
            }           
        }
        String q="What time is it?";
        String d="What date is it?";
        String D=d.toLowerCase();
        String Q = q.toLowerCase();
        String Input=input.toLowerCase();
        if(Q.contains(Input)){
            time();
            return;
        }
        else if(D.contains(Input)){
            date();
            return;
        }
        
                                                 
        for(String key : keys){
            String lowerkey = key.toLowerCase();
            String lowerquestion = input.toLowerCase();
            if (!lowerkey.contains(lowerquestion)){               
                chatarea.append("Bot : Uhho! Sorry,Can't understand I am under develope \n      Try again\n\n");
                
                               
                return;
            }           
        }
    }
    public void time(){
        LocalTime time = LocalTime.now();
        chatarea.append("Bot : "+time +"\n");
        
    }
    public void date(){
        LocalDate date=LocalDate.now();
        chatarea.append("Bot : "+date+"\n");
    }
    
               
              
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatarea = new javax.swing.JTextArea();
        typeboxPanel = new javax.swing.JPanel();
        typebox = new javax.swing.JTextField();
        vbutton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        darkON = new javax.swing.JMenuItem();
        darkOFF = new javax.swing.JMenuItem();
        dMode = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatBot");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 247, 226));

        titlePanel.setBackground(new java.awt.Color(152, 219, 107));

        jPanel3.setBackground(new java.awt.Color(225, 247, 226));

        jLabel1.setBackground(new java.awt.Color(152, 219, 107));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nwu/chatbot/robot.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Chat Bot");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Always Active ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setBorder(null);

        chatarea.setEditable(false);
        chatarea.setBackground(new java.awt.Color(225, 247, 226));
        chatarea.setColumns(20);
        chatarea.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        chatarea.setForeground(new java.awt.Color(102, 102, 102));
        chatarea.setRows(5);
        jScrollPane1.setViewportView(chatarea);

        typeboxPanel.setBackground(new java.awt.Color(152, 219, 107));

        typebox.setBackground(new java.awt.Color(225, 247, 226));
        typebox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typebox.setForeground(new java.awt.Color(51, 51, 51));
        typebox.setText("Type here . . . ");
        typebox.setToolTipText("Type your message here . .");
        typebox.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        typebox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeboxMouseClicked(evt);
            }
        });
        typebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeboxActionPerformed(evt);
            }
        });

        vbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nwu/chatbot/mic (1).png"))); // NOI18N
        vbutton.setToolTipText("Voice Command");
        vbutton.setBorder(null);
        vbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbuttonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setToolTipText("Clear chat area");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout typeboxPanelLayout = new javax.swing.GroupLayout(typeboxPanel);
        typeboxPanel.setLayout(typeboxPanelLayout);
        typeboxPanelLayout.setHorizontalGroup(
            typeboxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typeboxPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(typebox, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(vbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        typeboxPanelLayout.setVerticalGroup(
            typeboxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typeboxPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(typeboxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typebox))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(typeboxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeboxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nwu/chatbot/settings.png"))); // NOI18N
        jMenu2.setText("Settings");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nwu/chatbot/night-mode.png"))); // NOI18N
        jMenu1.setText(" Dark Mode");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        darkON.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        darkON.setText("On");
        darkON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkONActionPerformed(evt);
            }
        });
        jMenu1.add(darkON);

        darkOFF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        darkOFF.setText("Off");
        darkOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkOFFActionPerformed(evt);
            }
        });
        jMenu1.add(darkOFF);

        jMenu2.add(jMenu1);

        dMode.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nwu/chatbot/settings (1).png"))); // NOI18N
        dMode.setText("Developer Mode");
        dMode.setToolTipText("Develope bots knowledge");
        dMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dModeActionPerformed(evt);
            }
        });
        jMenu2.add(dMode);

        exit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nwu/chatbot/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu2.add(exit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeboxMouseClicked
        typebox.setText("");
    }//GEN-LAST:event_typeboxMouseClicked

    private void typeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeboxActionPerformed
                String input = typebox.getText();
                typebox.setText("");
                chatarea.append("Me : "+input+"\n");
                                            
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    answer(input);
                    
                }
               }, 1200);
    }//GEN-LAST:event_typeboxActionPerformed

    private void darkONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkONActionPerformed
        Color black=new Color(45, 59, 46);
        Color white=new Color(240, 247, 240);
        
        chatarea.setBackground(black);
        chatarea.setForeground(white);
        titlePanel.setBackground(black);
        typeboxPanel.setBackground(black);
    }//GEN-LAST:event_darkONActionPerformed

    private void darkOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkOFFActionPerformed
        Color greenish=new Color(225,247,226);
        Color ash =new Color(102,102,102);
        Color green=new Color(152,219,107);
        
        chatarea.setBackground(greenish);
        chatarea.setForeground(ash);
        titlePanel.setBackground(green);
        typeboxPanel.setBackground(green);
    }//GEN-LAST:event_darkOFFActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void vbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbuttonActionPerformed
        JOptionPane.showMessageDialog(null,"This option is under develope !!","Warning",1);
    }//GEN-LAST:event_vbuttonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        chatarea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void dModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dModeActionPerformed
        JOptionPane.showMessageDialog(null,"This option is under develope !!","Warning",1);
    }//GEN-LAST:event_dModeActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BotInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BotInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BotInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BotInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                new BotInterface().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatarea;
    private javax.swing.JButton clearButton;
    private javax.swing.JMenuItem dMode;
    private javax.swing.JMenuItem darkOFF;
    private javax.swing.JMenuItem darkON;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField typebox;
    private javax.swing.JPanel typeboxPanel;
    private javax.swing.JButton vbutton;
    // End of variables declaration//GEN-END:variables
}
