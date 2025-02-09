package NestedClassesAndEnums;

// public enum SeasonEnum {
//     WINTER,

//     SUMMER;

// }

// public enum SeasonEnum {
//     WINTER("low"), SUMMER("High");

//     private final String temp;

//     private SeasonEnum(String temp) {
//         this.temp = temp;
//     }

//     public String getTemp() {
//         return temp;
//     }

//     public void getOridinal() {
//         for (SeasonEnum s : SeasonEnum.values()) {
//             System.out.println(s.ordinal());
//         }
//     }

// }

public enum SeasonEnum {
    WINTER("Low") {
        public void getTemp() {
            System.out.println("low Temperature");
        }
    },
    SUMMER("High") {
        public void getTemp() {
            System.out.println("High temperature");
        }
    };

    private final String temp;
    private boolean flowers;

    public abstract void getTemp();

    private SeasonEnum(String temp) {
        this.temp = temp;
    }

    public boolean hasFlowers() {
        return flowers;
    }

    public void getOridinal() {
        for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s.ordinal());
        }
    }

}