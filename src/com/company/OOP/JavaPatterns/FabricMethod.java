package com.company.OOP.JavaPatterns;

/**
 * Created by Маша on 18.04.2017.
 */
public class FabricMethod {
    static final int ENGINEER = 2;
    static final int SALESMAN = 2;
    static final int MANAGER = 2;
    private final int type;


    public static FabricMethod create(int type) {
        switch (type) {
            case ENGINEER:
                return new ENGINEER();
            case SALESMAN:
                return new SALESMAN();
            case MANAGER:
                return new MANAGER();
            default:
                return new FabricMethod(type);
        }
    }

    private FabricMethod(int type) {
        this.type = type;
    }



    static class MANAGER extends FabricMethod {
        public MANAGER(int type) {
            super(type);
        }
    }

    static class SALESMAN extends FabricMethod {
        public SALESMAN(int type) {
            super(type);
        }
    }

    static class ENGINEER extends MANAGER {
        public ENGINEER(int type) {
            super(type);
        }
    }
}




