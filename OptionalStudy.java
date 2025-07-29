import java.util.Optional;

public class OptionalStudy {

    public static void createsEmptyOptional(){
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
    }

    public static void createsNonNullOptional(){
        String name = "Marco";
        Optional<String> optionalName = Optional.of(name);
        System.out.println(optionalName.isPresent());
    }

    public static void createsNullOptional(){
        Optional<String> nullOptional = Optional.of(null);
      } 

    public static void createsNullableOptionalPassingNull(){
        Optional<String> nullableOptional = Optional.ofNullable(null);
    }

    public static void createsNullableOptionalPassingValue(){
        String name = "Marco";
        Optional<String> nullableOptional = Optional.ofNullable(name);
        System.out.println(nullableOptional.isPresent());
    }

    public static void useIfPresentToCheckLengthPassingNull(){
        String nameNull = null;
        Optional<String> optionalName = Optional.of(nameNull);
        optionalName.ifPresent(name -> System.out.println(name.length()));
    }

    public static void useIfPresentToCheckLengthPassingValue(){
        Optional<String> optionalName = Optional.of("Marco");
        optionalName.ifPresent(name -> System.out.println(name.length()));
    }

    public static void returnsValueWithOrElse(){
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Marco");
        System.out.println(name);
    }

    public static void main(String[] args) {
        createsEmptyOptional(); // returns false 'cause it's an empty optional
        
        createsNonNullOptional(); // returns true 'cause  it's non-null value 
        // the variable name has it's value and it's represented in the optional

        // createsNullOptional();  // this would return a NullPointerException 
    
        createsNullableOptionalPassingNull(); // this method doesn't return anything
        // but we can run, 'cause it's an Optional.ofNullable that accepts null arguments

        createsNullableOptionalPassingValue(); // this method accepts null argument
        // like the one above, but in this one i passed a valid argument for testing

        // useIfPresentToCheckLengthPassingNull(); // this method would return an
        // NullPointerException 'cause we passed an null argument to the optional

        useIfPresentToCheckLengthPassingValue();

        returnsValueWithOrElse();

    }
    
}