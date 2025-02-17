package Annotations;

public @interface CustomAnnotation2 {

    // value allows you to assign an annotation value without declaring a name for
    // the value
    // It only works if the value is the only element in the annotation
    // If there are multiple elements, you must declare a name for each element
    int value();
}
