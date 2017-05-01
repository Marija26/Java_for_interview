package com.company.Patterns;

/**
 * Created by Маша on 27.04.2017.
 */
public class Chains {
    public static void main(String[] args) {
    }


    class Level {
        public static final int INFO = 1;
        public static final int DEBUG = 2;
        public static final int ERROR = 3;
    }

    interface Logger {
        void writeMessage(String message, int level);

    }

    class SMSLogger implements Logger {
        int priority;

        public SMSLogger(int priority) {
            this.priority = priority;
        }

        Logger next;

        public void setNext(Logger next) {
            this.next = next;
        }

        @Override
        public void writeMessage(String message, int level) {
            if (level <= priority) {
                System.out.println("SMS " + message);
            }
            if (next != null) {
                next.writeMessage(message, level);
            }
        }
    }

    class FileLogger implements Logger {
        int priority;

        public FileLogger(int priority) {
            this.priority = priority;
        }

        Logger next;

        public void setNext(Logger next) {
            this.next = next;
        }

        @Override
        public void writeMessage(String message, int level) {
            if (level <= priority) {
                System.out.println("SMS " + message);
            }
            if (next != null) {
                next.writeMessage(message, level);
            }


        }
    }
}
