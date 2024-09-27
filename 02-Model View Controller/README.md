# Thymeleaf ve Spring Uygulamaları

Thymeleaf, Java tabanlı bir şablon motorudur ve Spring uygulamalarında yaygın olarak kullanılır. 

## Thymeleaf Özellikleri

### 1. `th:if`
Bir öğenin şablonda görünmesini şartlandırmak için kullanılır.
```html
    <div th:if="${user != null}">Kullanıcı var.</div>
```

### 2. `th:unless`
Bir öğenin şablonda görünmemesini şartlandırmak için kullanılır.
```html
    <div th:unless="${user == null}">Kullanıcı var.</div>
```

### 3. `th:switch`
Bir değişkenin farklı değerlere göre koşullu ifadeler oluşturmak için kullanılır.

### 4. `th:case`
th:switch içinde belirtilen değere göre farklı durumlar tanımlamak için kullanılır.
```html
    <div th:switch="${status}">
        <div th:case="'active'">Aktif</div>
        <div th:case="'inactive'">Pasif</div>
        <div th:case="*">Bilinmeyen durum</div>
    </div>
```

### 5. `th:object`
Bir nesne ile ilgili bağlamı ayarlamak için kullanılır.
```html
    <form th:object="${user}">
        <input type="text" th:field="*{name}" />
    </form>
```

### 6. `th:text`
Bir öğenin içeriğini dinamik olarak değiştirmek için kullanılır.
```html
    <p th:text="${message}">Default mesaj</p>
```

### 7. `th:src`
Bir görselin veya dosyanın kaynak URL'sini dinamik olarak ayarlamak için kullanılır.
```html
<img th:src="@{${user.profilePicture}}" />
```

### 8. `th:href`
Bir URL'yi veya rotayı dinamik olarak belirlemek için kullanılır.

#### Temel Kullanım:
```html
<a th:href="@{/home}">Ana Sayfa</a>
```

#### Parametre Gönderme
```html
<a th:href="@{/user(id=${user.id})}">Kullanıcı Profili</a>
```

#### Dinamik Değerler Kullanma
```html
<a th:href="@{/post/{id}(id=${post.id})}">Yazıyı Görüntüle</a>
```

#### Değişken Kullanımı
```html
<a th:href="@{/profile/${username}}">Profilim</a>
```

#### Kaynak Yolu Belirleme
```html
<img th:src="@{/images/logo.png}" alt="Logo" />
```

### 9. `th:field`
Bir HTML form elemanını (örneğin, input, select, textarea gibi) model nesnesinin bir özelliğiyle bağlamak için kullanılır. Bu sayede form verileri, sunucuya gönderildiğinde doğru bir şekilde model nesnesine aktarılır.
```html
<input type="text" th:field="*{username}" />
```

### 10. `th:action`
Formun gönderileceği URL’yi tanımlamak için kullanılır. Genellikle, formun gönderileceği kontrolcü (controller) yönteminin URL'sini belirtmek için kullanılır.
```html
<form th:action="@{/submitForm}" method="post">
    <input type="text" th:field="*{username}" />
    <button type="submit">Gönder</button>
</form>
```
### 11. `th:value`
Bir HTML elementinin value (değer) özelliğine sunucu tarafındaki bir değişkenin değerini atamak için kullanılır.
```html
<input type="text" th:value="${user.name}" />
```

### 12. `th:errors`
Bir form elemanında oluşan validasyon hatalarını göstermek için kullanılır. 
```html
<div th:if="${#fields.hasErrors('name')}" th:errors="*{name}">Hata: </div>
```

# Controller'da Model Kullanımı

## Model Kullanımı:
Controller'da veri gönderimi için kullanılır. Genellikle Model arayüzü veya ModelAndView sınıfı kullanılarak veriler şablona aktarılır.
```html
@GetMapping("/user")
public String getUser(Model model) {
	User user = userService.findUserById(1);
	model.addAttribute("user", user);
	return "userProfile";
}
```

# Utility Method Kullanımı

## Utility Method Kullanımı:
Tekrarlanan işlemler için yardımcı (utility) metodlar tanımlanabilir. Bu metodlar, controller'da veya diğer sınıflarda kullanılabilir.
```html
public class Utility {
    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}

@GetMapping("/date")
public String getDate(Model model) {
    LocalDate today = LocalDate.now();
    model.addAttribute("formattedDate", Utility.formatDate(today));
    return "dateView";
}
```
