package NestedClassesAndEnums;

public class EnumRunner {
    public static void main(String[] args) {
        SeasonEnum s = SeasonEnum.WINTER;
        s.getOridinal();

        switch (s) {
            case WINTER:
                System.out.println("Winter is here");
                break;
            // case SeasonEnum.SUMMER: // compilter Error
            // System.out.println("Summer is here");
            // break;
            default:
                System.out.println("Season is not here");
        }
    }
}
