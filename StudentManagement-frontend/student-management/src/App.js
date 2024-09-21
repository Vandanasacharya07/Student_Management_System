
import React, { useState } from 'react';
import StudentList from './StudentList';
import StudentForm from './StudentForm';
import './App.css';

const App = () => {
    const [editingStudent, setEditingStudent] = useState(null);
    const [showForm, setShowForm] = useState(false);

    const handleEdit = (student) => {
        setEditingStudent(student);
        setShowForm(true);
    };

    const handleFormSubmit = () => {
        setEditingStudent(null);
        setShowForm(false);
    };

    const handleCancel = () => {
        setEditingStudent(null);
        setShowForm(false);
    };

    return (
        <div>
            <h1>Student Management System</h1>
            {showForm ? (
                <StudentForm student={editingStudent} onSubmit={handleFormSubmit} onCancel={handleCancel} />
            ) : (
                <>
                    <button onClick={() => { setShowForm(true); setEditingStudent(null); }}>Add Student</button>
                    <StudentList onEdit={handleEdit} />
                </>
            )}
        </div>
    );
};

export default App;
