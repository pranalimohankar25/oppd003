class Emerging_Technologie {
    void forum() {
        System.out.println("Forum: General Emerging Technologies Forum");
    }
}

class AIDS extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President:pranali mohankar");
        System.out.println("Forum Vice President:shreyanshi chavhan");
        System.out.println("Forum Secretary:riya m");
        System.out.println("Forum Treasurer: sampada joshi");
        System.out.println("Event Head:pranali mohankar");
    }
}

class AIML extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President:Pranali Mohankar ");
        System.out.println("Forum Vice President:payal d ");
        System.out.println("Forum Secretary:savi m");
        System.out.println("Forum Treasurer:pavan ");
        System.out.println("Event Head:pooja");
    }
}

class CSE extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President:Pranali Mohankar");
        System.out.println("Forum Vice President:Kinjal D");
        System.out.println("Forum Secretary:sia");
        System.out.println("Forum Treasurer:Yug");
        System.out.println("Event Head:Amulya");
    }
}

public class Main {
    public static void main(String[] args) {
        AIML aimlForum = new AIML();
        AIDS aidsForum = new AIDS();
        CSE cseForum = new CSE();

        System.out.println("AIML Forum Details:");
        aimlForum.forum();
        System.out.println();

        System.out.println("AIDS Forum Details:");
        aidsForum.forum();
        System.out.println();

        System.out.println("CSE Forum Details:");
        cseForum.forum();
    }
}

