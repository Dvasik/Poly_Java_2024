byte b1 = 10;
int i1 = 1024;
float f1 = 1.5f;
double d1 = 1.5d;

byte b2 = b1 + 10;     // ошибка incompatible types
int i2 = i1 + 101.0f;  // ошибка incompatible types
float f2 = f1 + d1;    // ошибка incompatible types
double d2 = f1 + 1.5d; // 3.0d
