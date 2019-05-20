public class DataTypesTester {

    public static void testByte() {
        byte a = 5, b = 2, c;
        System.out.println("\n***** byte *****");
        System.out.println("\n***** Arithmetical Operators *****");

        //addition
        c = (byte)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = (byte)(a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = (byte)(a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = (byte)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = (byte)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
        //unary minus
        c = (byte)-a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (byte)+a;
        System.out.printf("+%d = %d\n", a, c);

        //prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        //bitwise AND
        c = (byte)(a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        //bitwise OR
        c = (byte)(a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        //bitwise XOR
        c = (byte)(a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        //bitwise unary compliment
        c = (byte)~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        //left shift
        c = (byte)(a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        //right shift
        c = (byte)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        //zero full right shift
        a = 5;
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        //zero full right shift
        a = -5;
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n",
                String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'),
                String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0')
        );

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n\n", c, a, c %= a);

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator *****");
        int i = 1_000_000;
        short sh = -32000;
        char ch = '\u0010';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (byte)sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte)ch;
        System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte)i;
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", i, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        //c = (byte)bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);
    }

    public static void testShort() {
        short a = 5, b = 2, c;

        System.out.println("\n***** short *****");
        System.out.println("\n***** Arithmetical Operators *****");

        //addition
        c = (short)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = (short)(a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = (short)(a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = (short)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = (short)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
        //unary minus
        c = (short)-a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = (short)+a;
        System.out.printf("+%d = %d\n", a, c);

        //prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        //bitwise AND
        c = (short)(a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise OR
        c = (short)(a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise XOR
        c = (short)(a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = (short)~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //left shift
        c = (short)(a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //right shift
        c = (short)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //zero full right shift
        a = 5;
        c = (short)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //zero full right shift
        a = -5;
        c = (short)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n\n", c, a, c %= a);

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator *****");
        byte bt = 1;
        char ch = '\u0010';
        int i = 1_000_000;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short)ch;
        System.out.printf("short = char: c = (short)%c --> c = %d\n", ch, c);
        c = (short)i;
        System.out.printf("short = int: c = (short)%d --> c = %d\n", i, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        // c = (short)bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
    }

    public static void testChar() {
        char a = '\u0010', b = '\u0010', c;

        System.out.println("\n***** int *****");
        System.out.println("\n***** Arithmetical Operators *****");

        //addition
        c = (char)(a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);

        //subtraction
        c = (char)(a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);

        //multiplication
        c = (char)(a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);

        //division
        c = (char)(a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);

        //modulus
        c = (char)(a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);

        a = '\u0010';
        //unary minus
        c = (char)-a;
        System.out.printf("-%c = %c\n", a, c);
        //unary plus
        c = (char)+a;
        System.out.printf("+%c = %c\n", a, c);

        //prefix increment
        a = '\u0010';
        System.out.printf("++%c = %c\n", a, ++a);

        //postfix increment
        a = '\u0010';
        System.out.printf("%c++ = %c\n", a, a++);

        //prefix decrement
        a = '\u0010';
        System.out.printf("--%c = %c\n", a, --a);

        //postfix decrement
        a = '\u0010';
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        //bitwise AND
        c = (char)(a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(b),
                Integer.toBinaryString(c)
        );

        //bitwise OR
        c = (char)(a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(b),
                Integer.toBinaryString(c)
        );

        //bitwise XOR
        c = (char)(a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(b),
                Integer.toBinaryString(c)
        );

        //bitwise unary compliment
        c = (char)~a;
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //left shift
        c = (char)(a << 1);
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //right shift
        c = (char)(a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(c)
        );

        //zero full right shift
        a = 5;
        c = (char)(a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(c)
        );

        //zero full right shift
        a = '\u0010';
        c = (char)(a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(c)
        );

        System.out.println("\n***** Assignment Operators *****");

        c = '\u0010';
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n\n", c, a, c %= a);

        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        System.out.printf("%c >>= %c --> c = %c\n", c, a, c >>= a);
        System.out.printf("%c <<= %c --> c = %c\n", c, a, c <<= a);
        System.out.printf("%c >>>= %c --> c = %c\n", c, a, c >>>= a);

        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators *****");
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator *****");
        byte bt = 1;
        short sh = -32000;
        int i = 1_000_000;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char)bt;
        System.out.printf("(char) = byte: c = (char)%d --> c = %c\n", bt, c);
        c = (char)sh;
        System.out.printf("(char) = short: c = (char)%d --> c = %c\n", sh, c);
        c = (char)i;
        System.out.printf("(char) = char: c = (char)%d --> c = %c\n", i, c);
        c = (char)l;
        System.out.printf("(char) = long: c = (char)%d --> c = %c\n", l, c);
        c = (char)f;
        System.out.printf("(char) = float: c = (char)%f --> c = %c\n", f, c);
        c = (char)d;
        System.out.printf("(char) = double: c = (char)%f --> c = %c\n", d, c);
        // c = (char)bool;
        System.out.printf("(char) = boolean: c = (char)%b --> Compile Error\n", bool);
    }

    public static void testInt() {
        int a = 5, b = 2, c;
        System.out.println("\n***** int *****");
        System.out.println("\n***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
        //unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        //prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        //bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //zero full right shift
        a = 5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //zero full right shift
        a = -5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n\n", c, a, c %= a);

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator *****");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0010';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
    }

    public static void testLong() {
        long a = 5L, b = 2L, c;

        System.out.println("\n***** long *****");
        System.out.println("\n***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5L;
        //unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        //prefix increment
        a = 5L;
        System.out.printf("++%d = %d\n", a, ++a);

        //postfix increment
        a = 5L;
        System.out.printf("%d++ = %d\n", a, a++);

        //prefix decrement
        a = 5L;
        System.out.printf("--%d = %d\n", a, --a);

        //postfix decrement
        a = 5L;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        //bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        //left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        //zero full right shift
        a = 5L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        //zero full right shift
        a = -5L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 7L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n\n", c, a, c %= a);

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator *****");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0010';
        int i = 1_000_000_000;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = i;
        System.out.printf("long = int: c = %d --> c = %d\n", i, c);
        c = (long)f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long)d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long)bool;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
    }

    public static void testDouble() {
        double a = 5., b = 2., c;

        System.out.println("\n***** double *****");
        System.out.println("***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        a = 5;
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        //prefix increment
        a = 5;
        System.out.printf("++%f = %f\n", a, ++a);
        //postfix increment
        a = 5;
        System.out.printf("%f++ = %f\n", a, a++);
        //prefix decrement
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);
        //postfix decrement
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n***** Bitwise Operators not allowed for floating numbers *****");
//        c = a & b;
//        c = a | b;
//        c = a ^ b;
//        c = ~a;
//        c = a << 1;
//        c = a >> 1;
//        c = a >>> 1;
//        c = a >>> 1;
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n\n", c, a, c %= a);

        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators *****");
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator *****");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0010';
        int i = 1_000_000;
        long l = 100000000000000000L;
        float f = 1.9f;
        boolean bool = true;

        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = i;
        System.out.printf("double = int: c = %d --> c = %f\n", i, c);
        c = l;
        System.out.printf("double = long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);
        // c = (double)bool;
        System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);

    }

    public static void testFloat() {
        float a = 5.f, b = 2.f, c;

        System.out.println("\n***** float *****");
        System.out.println("\n***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        a = 5.f;
        //unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        //prefix increment
        a = 5.f;
        System.out.printf("++%f = %f\n", a, ++a);

        //postfix increment
        a = 5.f;
        System.out.printf("%f++ = %f\n", a, a++);

        //prefix decrement
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);

        //postfix decrement
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n***** Bitwise Operators not allowed for floating numbers *****");
//        c = a & b;
//        c = a | b;
//        c = a ^ b;
//        c = a << 1;
//        c = a >> 1;
//        c = a >>> 1;
//        c = a >>> 1;

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n\n", c, a, c %= a);

        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators *****");
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n***** Type Cast Operator *****");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0010';
        int i = 1_000_000;
        long l = 100000000000000000L;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = i;
        System.out.printf("float = int: c = %d --> c = %f\n", i, c);
        c = l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c = (float)d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        // c = (int)bool;
        System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);

    }

    public static void testBoolean() {
        boolean a = true, b = false, c;

        System.out.println("\n***** boolean *****");
        System.out.println("\n***** Arithmetical operators not allowed for boolean *****");
        // c = a + b; // addition
        // c = a - b; // subtraction
        // c = a * b; // multiplication
        // c = a / b; // division
        // c = a % b; // modulus
        // c = -a; // unary minus
        // c = +a; // unary plus
        // c = ++a; // prefix increment
        // c = a++; // postfix increment
        // c = --a; // prefix decrement
        // c = a--; // postfix decrement

        System.out.println("\n***** Bitwise Operators. Allowed only part of them *****");

        c = a & b;
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b;
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // c = ~a;
        // c = a << 1;
        // c = a >> 1;
        // c = a >>> 1;

        System.out.println("\n***** Assignment Operators. Allowed only part of them *****");

        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
        // c += a;
        // c -= a;
        // c *= a;
        // c /= a;
        // c %= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;

        System.out.println("\n***** Relational Operators. Allowed only 'equals' and 'not equals' *****");

        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
        //c = a > b;
        //c = a >= b;
        //c = a < b;
        //c = a <= b;

        System.out.println("\n***** Logical Operations *****");

        c = a && b;
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b;
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        System.out.printf("!%b --> %b\n", a, !a);


        System.out.println("\n***** Condition Operator *****");
        System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

        System.out.println("\n***** Type Cast Operator not allowed for boolean *****");

    }

    public static void testStudent() {
        Student st1 = new Student("Nik", 5);
        Student st2 = new Student("Tim", 6);
        Student st = new Student("Nik", 5);
        System.out.println("\n***** Student *****");

        System.out.println("\n***** Arithmetical Operators not allowed *****");

        System.out.println("\n***** Bitwise Operators not allowed for String *****");

        System.out.println("\n***** Relational Operators *****");

        System.out.printf("\"%s\" == \"%s\" --> %b", st1,st, st1 == st);
        System.out.println(", it's because we match links of different objects");

        System.out.printf("\"%s\".equals(\"%s\") --> %b", st1, st, st1.equals(st));
        System.out.println(", using 'equals' we match value. Works only if override. Otherwise works like '=='");

        System.out.printf("\"%s\" != \"%s\" --> %b", st1, st2, st1 != st2);
        System.out.println(", it's because links aren't the same");

        System.out.println("\n***** Logical Operators not allowed for String *****");
        System.out.println("\n***** Condition Operator only for ==, and != operators *****");

        System.out.println("\n***** Type Cast. Works only for String  *****");
        String str = st1.toString();
        System.out.printf("String = Student.toString: String = \"%s\"\n", str);
        System.out.printf("String = Student.toString: String = \"Student@250fd6\", if method toString not override\n", str);
    }

    public static void testString() {
        String a = "one", b = "two", c;

        System.out.println("\n***** String *****");
        System.out.println("\n***** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("\"%s\" + \"%s\" = \"%s\"\n", a, b, c);
        c = "three";
        System.out.printf("\"%s\" += \"%s\" --> c = \"%s\"\n", c, a, c += a);
        int i = 1;
        System.out.printf("%d + \"%s\" = \"%s\"\n", i, c, i + c);
        float f = 1.f;
        System.out.printf("%f + \"%s\" = \"%s\"\n", f, c, f + c);
        boolean t = true;
        System.out.printf("%b + \"%s\" = \"%s\"\n", t, c, t + c);
        char ch = '\u1000';
        System.out.printf("%c + \"%s\" = \"%s\"\n", ch, c, ch + c);
        System.out.println("\n***** Other arithmetical operators not allowed for String *****");
//        //subtraction
//        c = a - b;
//        //multiplication
//        c = a * b;
//        //division
//        c = a / b;
//        //modulus
//        c = a % b
//        //unary minus
//        c = -a;
//        //unary plus
//        c = +a;
//        //prefix increment
//        c = ++a;
//        //postfix increment
//        c = a++;
//        //prefix decrement
//        c = --a;
//        //postfix decrement
//        c = a--;
        System.out.println("\n***** Bitwise Operators not allowed for String *****");

        System.out.println("\n***** Relational Operators *****");

        a = "one";
        b = "one";
        System.out.printf("\"%s\" == \"%s\" --> %b", a, b, a == b);
        System.out.println(", it's because all strings stored in String pool");

        b =  new String("one");
        System.out.printf("\"%s\" == new String(\"%s\") --> %b", a, b, a == b);
        System.out.println(", it's because we again initialize String");

        System.out.printf("\"%s\".equals(new String(\"%s\")) --> %b", a, b, a.equals(b));
        System.out.println(", using equals we match value. Works only if override. Otherwise works like '=='");

        System.out.printf("\"%s\" != new String(\"%s\") --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operators not allowed for String *****");
        System.out.println("\n***** Condition Operator allowed only for ==, and != operators *****");


        System.out.println("\n***** Type Cast. We can use only methods to cast value  *****");
        byte bt = 1;
        short sh = -32000;
        ch = '\u0010';
        i = 1_000_000;
        long l = 100000000000000000L;
        f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = Byte.toString(bt);
        System.out.printf("String = byte: c = Byte.toString(%d) --> c = \"%s\"\n", bt, c);
        c = String.valueOf(bt);
        System.out.printf("String = byte: c = String.valueOf(%d) --> c = \"%s\"\n", bt, c);

        c = Short.toString(sh);
        System.out.printf("String = short: c = Short.toString(%d) --> c = \"%s\"\n", sh, c);
        c = String.valueOf(sh);
        System.out.printf("String = short: c = String.valueOf(%d) --> c = \"%s\"\n", sh, c);

        c = Character.toString(ch);
        System.out.printf("String = char: c = Character.toString('%c') --> c = \"%s\"\n", ch, c);
        c = String.valueOf(ch);
        System.out.printf("String = char: c = String.valueOf('%c') --> c = \"%s\"\n", ch, c);

        c = Integer.toString(i);
        System.out.printf("String = int: c = Integer.toString(%d) --> c = \"%s\"\n", i, c);
        c = String.valueOf(i);
        System.out.printf("String = int: c = String.valueOf(%d) --> c = \"%s\"\n", i, c);

        c = Long.toString(l);
        System.out.printf("String = long: c = Long.toString(%d) --> c = \"%s\"\n", l, c);
        c = String.valueOf(l);
        System.out.printf("String = long: c = String.valueOf(%d) --> c = \"%s\"\n", l, c);

        c = Float.toString(f);
        System.out.printf("String = float: c = Float.toString(%f) --> c = \"%s\"\n", f, c);
        c = String.valueOf(f);
        System.out.printf("String = float: c = String.valueOf(%f) --> c = \"%s\"\n", f, c);

        c = Double.toString(d);
        System.out.printf("String = double: c = Double.toString(%f) --> c = \"%s\"\n", d, c);
        c = String.valueOf(d);
        System.out.printf("String = double: c = String.valueOf(%f) --> c = \"%s\"\n", d, c);

        c = Boolean.toString(bool);
        System.out.printf("String = boolean: c = Boolean.toString(%b) --> c = \"%s\"\n", bool, c);
        c = String.valueOf(bool);
        System.out.printf("String = boolean: c = String.valueOf(%b) --> c = \"%s\"\n", bool, c);
    }
}
