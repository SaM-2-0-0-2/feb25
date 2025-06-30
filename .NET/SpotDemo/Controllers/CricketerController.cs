using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using SpotDemo.Models;

namespace SpotDemo.Controllers
{
    public class CricketerController : Controller
    {

        // GET: CricketerController
        public ActionResult Index()
        {
            List<Cricketer> cricketers = Cricketer.GetAllPlayers();
            return View(cricketers);
        }

        // GET: CricketerController/Details/5
        public ActionResult Details(int id)
        {
            Cricketer cr = Cricketer.GetSingleCricketer(id);
            return View(cr);
        }

        // GET: CricketerController/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: CricketerController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Cricketer cr)
        {
            try
            {
                if (!ModelState.IsValid)
                {
                    return View(cr);
                }
                Cricketer.Insert(cr);
                return RedirectToAction(nameof(Index));
            }
            catch (Exception ex)
            {
                ViewBag.message = ex.Message;
                return View(cr);
            }
        }

        // GET: CricketerController/Edit/5
        public ActionResult Edit(int id)
        {
            return View(Cricketer.GetSingleCricketer(id));
        }

        // POST: CricketerController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Cricketer cr)
        {
            try
            {
                if (cr.Runs < 0)
                {
                    ViewBag.message = "Runs cannot be less than zero";
                    return View(cr);
                }
                Cricketer.Update(id, cr);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: CricketerController/Delete/5
        public ActionResult Delete(int id)
        {
            Cricketer cr = Cricketer.GetSingleCricketer(id);
            return View(cr);
        }

        // POST: CricketerController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                Cricketer.Delete(id);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
