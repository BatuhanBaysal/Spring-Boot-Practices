# Field Validation

## 1. `@NotBlank`
Boş olmayan, null olmayan ve yalnızca boşluk karakterlerinden oluşmayan değerler için kullanılır.
Genellikle String alanlarda kullanılır.

## 2. `@Size`
Bir String, koleksiyon veya dizinin minimum ve maksimum boyutunu belirlemek için kullanılır.
Örnek: @Size(min=5, max=15) bir String'in 5 ile 15 karakter arasında olmasını sağlar.

## 3. `@Email`
Bir String'in geçerli bir e-posta adresi formatında olup olmadığını kontrol eder.

## 4. `@Past`
Bir tarihin geçmişte olup olmadığını doğrulamak için kullanılır.
Örneğin doğum tarihini kontrol etmek için uygundur.

## 5. `@DateTimeFormat`
Bir String'in belirli bir tarih veya saat formatına uyması gerektiğinde kullanılır.
Örnek: @DateTimeFormat(pattern = "yyyy-MM-dd").