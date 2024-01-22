public static void main(String[] args) {
    double paramA = 5.0; double paramB = 2.0; char operation;
    calc(paramA, paramB, operation = '+');
    calc(paramA, paramB, operation = '-');
    calc(paramA, paramB, operation = '/');
    calc(paramA, paramB, operation = '*');
    calc(paramA, paramB, operation = '?');
}

static void calc(double paramA, double paramB, char operation){
    double result = 0;
    if(operation == '+'){
        result = paramA + paramB;
    }else if(operation == '-'){
        result = paramA - paramB;
    }else if (operation == '/'){
        result = paramA / paramB;
    }else if(operation == '*'){
        result = paramA * paramB;
    }else {
        System.out.println("INCORRECT OPERATION");
    }
    System.out.println("Calc result: " + result);
}

