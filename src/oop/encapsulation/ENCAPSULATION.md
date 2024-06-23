# ENCAPSULATION:
Trong java tính đóng gọi thể hiện qua các từ khoá truy cập như `private`, `protected`, `public` (Access modifier).

- `default`: Truy cập trong nội bô package.
- `private`: Truy cập trong nội bộ lớp.
- `public` : Thành phần công khai, truy cập tự do bên ngoài.
- `protected`: Thành phần được bảo vệ, bị hạn chế truy cập từ bên ngoài.
    | AC | Class | Package | Subclass | Out Package |
    |----|-------|---------|----------|-------------|
    | Pri|   O   |    X    |     X    |      X      |
    | Def|   O   |    O    |     X    |      X      |
    | Pro|   O   |    O    |     O    |      X      |
    | Pub|   O   |    O    |     O    |      X      |