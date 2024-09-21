// src/StudentForm.js
import React, { useState, useEffect } from 'react';
import { addStudent, updateStudent } from './StudentService';

const StudentForm = ({ student, onSubmit, onCancel }) => {
    const [formData, setFormData] = useState({
        firstName: '',
        lastName: '',
        email: '',
        phno: '',
        branch: ''
    });

    useEffect(() => {
        if (student) {
            setFormData(student);
        }
    }, [student]);

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        if (student) {
            await updateStudent(student.id, formData);
        } else {
            await addStudent(formData);
        }
        onSubmit();
    };

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" name="firstName" value={formData.firstName} onChange={handleChange} placeholder="First Name" required />
            <input type="text" name="lastName" value={formData.lastName} onChange={handleChange} placeholder="Last Name" required />
            <input type="email" name="email" value={formData.email} onChange={handleChange} placeholder="Email" required />
            <input type="tel" name="phno" value={formData.phno} onChange={handleChange} placeholder="Phone Number" required />
            <input type="text" name="branch" value={formData.branch} onChange={handleChange} placeholder="Branch" required />
            <button type="submit">Submit</button>
            <button type="button" onClick={onCancel}>Cancel</button>
        </form>
    );
};

export default StudentForm;
