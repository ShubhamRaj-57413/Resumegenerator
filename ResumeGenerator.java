import java.util.Scanner;

public class ResumeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting resume details from user
        System.out.println("=== RESUME DETAILS FORM ===\n");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your professional summary: ");
        String summary = sc.nextLine();

        System.out.print("Enter your skills (comma-separated): ");
        String skills = sc.nextLine();

        System.out.print("Enter your work experience (role, company, duration): ");
        String experience = sc.nextLine();

        System.out.print("Enter your education (degree, institution, year): ");
        String education = sc.nextLine();

        System.out.print("Enter any certifications: ");
        String certifications = sc.nextLine();

        // Printing the formatted resume
        printResume(name, email, phone, address, summary, skills, experience, education, certifications);

        sc.close();
    }

    public static void printResume(String name, String email, String phone, String address, 
                                   String summary, String skills, String experience, 
                                   String education, String certifications) {
        System.out.println("\n\n");
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                             RESUME                             ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝");

        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ CONTACT INFORMATION                                             │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println("Name        : " + name);
        System.out.println("Email       : " + email);
        System.out.println("Phone       : " + phone);
        System.out.println("Address     : " + address);

        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ PROFESSIONAL SUMMARY                                            │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println(summary);

        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ SKILLS                                                          │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println(skills);

        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ WORK EXPERIENCE                                                 │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println(experience);

        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ EDUCATION                                                       │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println(education);

        if (!certifications.isEmpty()) {
            System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
            System.out.println("│ CERTIFICATIONS                                                  │");
            System.out.println("└─────────────────────────────────────────────────────────────────┘");
            System.out.println(certifications);
        }

        System.out.println("\n╚════════════════════════════════════════════════════════════════╝");
    }
}
