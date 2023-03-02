package dev.waougri.maintenanceapp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true,nullable = false)
    private Long id;

    private String name;
    private String phoneNumber;
    private String address;

    private String date;

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Job> jobs = new ArrayList<>();
//
//    public void addJob(Job job) {
//        jobs.add(job);
//        job.setCustomer(this);
//    }
//
//    @Override
//    public String toString() {
//        return getClass().getSimpleName() + "(" +
//                "id = " + id + ", " +
//                "name = " + name + ", " +
//                "phoneNumber = " + phoneNumber + ", " +
//                "address = " + address + ")";
//    }
}
