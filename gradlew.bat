<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".IntroActivity"
    android:id="@+id/container"
    android:padding="20dp">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="180dp"
        android:layout_height="180dp"
        android:layout_marginTop="30dp"
        android:src="@drawable/prof1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/insertButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="64dp"
        android:text="Register to record"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView" />

    <Button
        android:id="@+id/showButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="See the records"
        app:layout_constraintTop_toBottomOf="@+id/insertButton"
        tools:layout_editor_absoluteX="20dp" />

    <Button
        android:id="@+id/deleteButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Delete"
        app:layout_constraintTop_toBottomOf="@+id/showButton"
        tools:layout_editor_absoluteX="20dp" />


    <Button
        android:id="@+id/nav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Nav"
        android:onClick=""
        app:layout_constraintTop_toBottomOf="@+id/deleteButton"
        tools:layout_editor_absoluteX="20dp" />



</androidx.constraintlayout.widget.ConstraintLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             