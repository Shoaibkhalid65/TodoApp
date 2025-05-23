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
[todo_1](https://github.com/user-attachments/assets/9ec5e53d-619c-4eb2-b52b-5d03796c8816)
### 📝 Add Task
![todo_2](https://github.com/user-attachments/assets/903a4a66-55be-40f4-aa3e-02d1059af985)
### 📝 Update Task
![todo_3](https://github.com/user-attachments/assets/6ac02cce-3759-48b5-98eb-718f268d3648)



---
### 🔧 Prerequisites
- Android Studio Hedgehog or later
- Android SDK 21+
- Kotlin 1.9+
- Gradle 8+

## 📁 Project Structure

```
com.example.todolist
│
├── model
│   └── Todo.kt (Entity)
│   └── TodoDao.kt
│   └── TodoDatabase.kt
│   └── TodoRepository.kt

├── view
│   └── AddTodoFragment.kt
│   └── MainActivity.kt
│   └── TodoItem.kt

├── viewmodel
│   └── MainViewModel.kt
│   └── MainViewModelFactory.kt

├── layout
│   └── activity_main.xml
│   └── add_task_fragment.xml
│   └── task_item_view.xml
```

## 📦 Dependencies

```kotlin
// Room
implementation "androidx.room:room-runtime:2.7.1"
kapt "androidx.room:room-compiler:2.7.1"

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
Feel free to check the [issues page](https://github.com/Shoaibkhalid65/TodoApp/issues) if you'd like to contribute.

---


## 🙌 Acknowledgements

* [FastAdapter by Mike Penz](https://github.com/mikepenz/FastAdapter)
* [Android Architecture Components](https://developer.android.com/topic/libraries/architecture)

---

⭐ **If you like this project, give it a star!**

```
