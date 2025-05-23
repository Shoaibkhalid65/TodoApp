# 📋 To-Do List App

A simple yet powerful To-Do List Android app built with modern Android development practices.  
Built using **MVVM Architecture**, **Room Persistence Library**, **FastAdapter**, **LiveData**, and **Data Binding**.

---

## 🚀 Features

- ✅ Add new tasks
- 🔄 Update existing tasks
- ❌ Delete tasks
- 📋 View all saved tasks
- 🔁 Live UI updates with LiveData!

- 🧠 Clean separation of concerns using MVVM
- ⚡ Fast and efficient list management with FastAdapter

---

## 🛠 Tech Stack

- 🧱 **Architecture**: MVVM (Model-View-ViewModel)
- 🗃 **Database**: Room Persistence Library
- 📡 **Data Binding** + LiveData
- ⚡ **UI Adapter**: FastAdapter
- 📝 **Language**: Kotlin
- 🎨 **UI**: Material Design Components

---

## 📸 Screenshots
### 🏠 Main Screen
![Main Screen](drawable/checklist.png)

[todo_1](https://github.com/user-attachments/assets/9ec5e53d-619c-4eb2-b52b-5d03796c8816)


---

## 🧑‍💻 Getting Started

To build and run this app on your local machine:

### 🔧 Prerequisites
- Android Studio Hedgehog or later
- Android SDK 21+
- Kotlin 1.9+
- Gradle 8+

### 🛠 Setup

1. Clone the repo
   ```bash
   git clone https://github.com/yourusername/todo-list-app.git
````

2. Open in Android Studio
3. Let Gradle sync and build the project
4. Run the app on an emulator or real device

---

## 📁 Project Structure

```
com.example.todolist
│
├── data
│   └── Task.kt (Entity)
│   └── TaskDao.kt
│   └── AppDatabase.kt
│
├── repository
│   └── TaskRepository.kt
│
├── ui
│   └── TaskAdapter.kt
│   └── MainActivity.kt
│   └── TaskViewModel.kt
│   └── TaskViewModelFactory.kt
│
├── layout
│   └── activity_main.xml
│   └── item_task.xml
```

---

## 📦 Dependencies

```kotlin
// Room
implementation "androidx.room:room-runtime:2.6.1"
kapt "androidx.room:room-compiler:2.6.1"

// Lifecycle
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0"
implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.7.0"

// Data Binding (enabled in build.gradle)

// FastAdapter
implementation "com.mikepenz:fastadapter:5.7.0"

// Kotlin
implementation "org.jetbrains.kotlin:kotlin-stdlib:1.9.0"
```

---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!
Feel free to check the [issues page](https://github.com/yourusername/todo-list-app/issues) if you'd like to contribute.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙌 Acknowledgements

* [FastAdapter by Mike Penz](https://github.com/mikepenz/FastAdapter)
* [Android Architecture Components](https://developer.android.com/topic/libraries/architecture)

---

⭐ **If you like this project, give it a star!**

```

---

Let me know if you want to include actual screenshots, license text, or GitHub badges!
```
