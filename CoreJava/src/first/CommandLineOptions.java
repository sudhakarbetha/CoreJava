package first;

import org.apache.commons.cli.*;

/**
 * Created by Sudhakar on 30-01-2017.
 */
public class CommandLineOptions {


    public void printName(String name) {
        System.out.println("Name=" + name);
    }

    public void printEmail(String email) {
        System.out.println("Email=" + email);
    }

    public void printHost(String host) {
        System.out.println("Host=" + host);
    }

    public void printPort(int port) {
        System.out.println("Port=" + port);
    }

    public static void main(String args[]) {

        CommandLineOptions object = new CommandLineOptions();

        Options options = new Options();

        Option d = new Option("d", false, "Customer has details");
        Option email = new Option("e", "email", true, "provide email address");
        Option host = new Option("h", "host", true, "provide host address");
        Option port = new Option("p", "port", true, "provide port number");
        Option name = new Option("n", "name", true, "provide name");

        options.addOption(d);
        options.addOption(email);
        options.addOption(host);
        options.addOption(port);
        options.addOption(name);

        CommandLineParser parser = new BasicParser();


        CommandLine commandLine;
        try {
            commandLine = parser.parse(options, args);


            if (commandLine.hasOption("d")
                    && commandLine.hasOption("e")
                    && commandLine.hasOption("n")
                    && commandLine.hasOption("h")
                    && commandLine.hasOption("p")) {

                object.printEmail(commandLine.getOptionValue("e"));
                object.printHost(commandLine.getOptionValue("h"));
                object.printName(commandLine.getOptionValue("n"));
                object.printPort(Integer.parseInt(commandLine.getOptionValue("p")));

            } else {
                HelpFormatter formatter = new HelpFormatter();
                String header = "Note: Pass the arguments correctly";
                String footer = "Please get in touch with Sudhakar Betha for more options";
                formatter.printHelp("CommandLineOptions", header, options, footer);

            }
        } catch (ParseException e) {
            System.out.println("ParseException:" + e);
        }


    }


}



