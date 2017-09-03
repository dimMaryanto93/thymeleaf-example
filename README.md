# Menggunakan Thymeleaf

Thymeleaf adalah Java Library yang digunakan untuk mentrasformasikan (render) data 
atau mem-produce text dari server, thymeleaf ini berbentuk XML/HTML format.

Tujuan utama dengan menggunakan thymeleaf ini adalah memisahkan 
antar logic code (__service__) dengan tampilan (__presenter__). Jadi dengan thymeleaf ini
kita diberikah fungsi-fungsi khusus yang hanya dengan menggunakan attribut dalam XML/HTML
yang nantinya setelah di jalankan di server datanya akan diolah dan ditampilkan sesuai dengan real datanya.
Mungkin di antara pembaca agak bingung dengan konsep ini baik lah saya jelaskan ya!! 

Jadi magsudnya itu dengan menggunakan template engine kita menuliskan perintah HTML bisa tapi begitu di jalakan di 
sisi server datanya akan otomatis berubah berikut contoh scriptnya:

```html
<div th:text="'Halo ini dari Thymeleaf'">Halo ini dari HTML</div>
```

Nah jadi disini ada 2 environtment yang berbeda yaitu di sisi client dan server, oklah jadi di sisi client ketika file `.html` 
dijakanakan secara langsung maka di browser anda akan menampilkan value `Halo ini dari HTML`. nah sedangkan di sisi server side 
(Thymeleaf yang di render oleh web server java seperti apache tomcat, jetty dll) nantinya kan menghasilkan 
value `Halo ini dari Thymeleaf`

Dijalankan langung dari file:

![Halo HTML](images/halo-html.png)

Dijalankan menggunakan springboot dengan template engine thymeleaf:

![Halo Thymeleaf](images/halo-thymeleaf.png)