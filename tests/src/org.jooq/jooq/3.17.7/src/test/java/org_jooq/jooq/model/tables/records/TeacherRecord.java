/*
 * Copyright and related rights waived via CC0
 *
 * You should have received a copy of the CC0 legalcode along with this
 * work. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package org_jooq.jooq.model.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import org_jooq.jooq.model.tables.Teacher;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeacherRecord extends UpdatableRecordImpl<TeacherRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>college.teacher.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>college.teacher.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>college.teacher.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>college.teacher.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>college.teacher.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>college.teacher.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Teacher.TEACHER.ID;
    }

    @Override
    public Field<String> field2() {
        return Teacher.TEACHER.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Teacher.TEACHER.LAST_NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public TeacherRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TeacherRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public TeacherRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public TeacherRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeacherRecord
     */
    public TeacherRecord() {
        super(Teacher.TEACHER);
    }

    /**
     * Create a detached, initialised TeacherRecord
     */
    public TeacherRecord(Long id, String firstName, String lastName) {
        super(Teacher.TEACHER);

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
}
