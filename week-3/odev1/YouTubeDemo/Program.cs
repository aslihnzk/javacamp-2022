using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeDemo
{
    internal class Programc
    {
        static void Main(string[] args)
        {
            //IoC Container
            CustomerManager customerManager = new CustomerManager(new CustomErrorsModes(), new TeacherCreditManager());
            customerManager.GiveCredit();
        }

        }
        
    
        
    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }
    

    
        public void Calculate(int creditType)
        {
            if (creditType == 1)
            {

            }

            if (creditType == 2)
            {

            }
            Console.WriteLine("Hesaplandı")
                }


        public void Save()
        {
            Console.WriteLine("Kredi Verildi");
        }


        interface ICreditManager
        {
            void Calculate();

            void Save();

        }
        abstract class BaseCreditManager : ICreditManager

        {
            public abstract void Calculate();
        }

            public virtual void Save()
            {
                Console.WriteLine("Kaydedildi");
            }
        }
        class TeacherCreditManager : BaseCreditManager, ICreditManager
        {
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        
            }
        public override void Save()
        {
            base.Save();
        }
            
            }

    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı")
            }
    }

        //DRY
    
    class CarCreditManager:BaseCreditManager,ICreditManager
    {
       public override void Calculate()
        {
            Console.WriteLine("Araba kredisi hesaplandı");
        }
    }

            


        //SOLID
        class Customer
        {
            public Customer()
            {
                Console.WriteLine("müşteri nesnesi başlatıldı");
            }
            public int Id { get; set; };

            public string City { get; set; }
        }
        class Person : Customer
        {
            public string FirstName { get; set; }
            public string LastName { get; set; }
            public string NationalIdentity { get; set; }

        }
        class Company : Customer
        {
            public string CompanyName { get; set; }
            public string TaxNumber { get; set; }
        }
        //Katmanlı Mimariler
        class CustomerManager
        {
            private Customer customer;
            private ICreditManager creditManager;
            public CustomerManager(Customer customer, ICreditManager creditManager)
            {
                _customer = customer;
                _creditManager = creditManager;
            }
            public void Save()
            {
                Console.WriteLine("Müşteri kaydedildi :");
            }
            public void Delete()
            {
                Console.WriteLine("Müşteri silindi :");

            }
            public void GiveCredit()
            {
                _creditManager.Calculate();
                Console.WriteLine("Kredi verildi");
            }
        }
    }


