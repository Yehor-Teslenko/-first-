public static void main(String[] args) {
    double paramA = 5.0; double paramB = 2.0; char operation;
    calc(paramA, paramB, operation = '+');
    calc(paramA, paramB, operation = '-');
    calc(paramA, paramB, operation = '/');
    calc(paramA, paramB, operation = '*');
    calc(paramA, paramB, operation = '?');
}

static void calc(double paramA, double paramB, char operation) {
    double result = 0;

    switch (operation) {
        case '+':
            result = paramA + paramB;
            break;
        case '-':
            result = paramA - paramB;
            break;
        case '/':
            if (paramB != 0) {
                result = paramA / paramB;
            } else {
                System.out.println("Cannot divide by zero");
                return;
            }
            break;
        case '*':
            result = paramA * paramB;
            break;
        default:
            System.out.println("INCORRECT OPERATION");
            return;
    }

    System.out.println("Calc result: " + result);
}
