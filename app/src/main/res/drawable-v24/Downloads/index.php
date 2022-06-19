<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <!-- Favicon -->
  <link rel="shortcut icon" href="./images/favicon.png" type="image/png" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
 <!-- ======== Swiper Js ======= -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/6.7.5/swiper-bundle.min.css"
    />

  <!-- Boxicons -->
  <link href='https://unpkg.com/boxicons@2.0.8/css/boxicons.min.css' rel='stylesheet'>
  <!-- Custom StyleSheet -->
  <link rel="stylesheet" href="./styles.css" />
  <title>Nature Ecommerce Website</title>
</head>

<body>

  <!-- Navigation -->
  <nav class="nav">
    <div class="wrapper container">
      <div class="logo"><a href="">
        <img src="./images/logo.png" alt="">
      </a>
      </div>
      <ul class="nav-list">
        <div class="top">
          <label for="" class="btn close-btn"><i class="fas fa-times"></i></label>
        </div>
        <li><a href="index.html">Home</a></li>
        <li>
          <a href="" class="desktop-item">Categories <span><i class="fas fa-chevron-down"></i></span></a>
          <input type="checkbox" id="showMega" />
          <label for="showMega" class="mobile-item">Categories <span><i class="fas fa-chevron-down"></i></span></label>
          <div class="mega-box">
            <div class="content">
              <div class="row">
                <img src="./images/nav.png" alt="" />
              </div>
              <div class="row">
                <header>Shop Layout</header>
                <ul class="mega-links">
                  <li><a href="#">Shop With Background</a></li>
                  <li><a href="#">Shop Mini Categories</a></li>
                  <li><a href="#">Shop Only Categories</a></li>
                  <li><a href="#">Shop Icon Categories</a></li>
                </ul>
              </div>
              <div class="row">
                <header>Filter Layout</header>
                <ul class="mega-links">
                  <li><a href="#">Sidebar</a></li>
                  <li><a href="#">Filter Default</a></li>
                  <li><a href="#">Filter Drawer</a></li>
                  <li><a href="#">Filter Dropdown</a></li>
                </ul>
              </div>
              <div class="row">
                <header>Product Layout</header>
                <ul class="mega-links">
                  <li><a href="#">Layout Zoom</a></li>
                  <li><a href="#">Layout Sticky</a></li>
                  <li><a href="#">Layout Sticky 2</a></li>
                  <li><a href="#">Layout Scroll</a></li>
                </ul>
              </div>
            </div>
          </div>
        </li>
        <li><a href="products.html">Products</a></li>
        
        <li><a href="">Login / Signup</a></li>
        

        <li>
          <a href="" class="desktop-item">More <span><i class="fas fa-chevron-down"></i></span></a>
          <input type="checkbox" id="showdrop2" />
          <label for="showdrop2" class="mobile-item">More <span><i class="fas fa-chevron-down"></i></span></label>
          <ul class="drop-menu2">
            <li><a href="">About</a></li>
            <li><a href="">Contact</a></li>
            <li><a href="">Faq</a></li>
          </ul>
        </li>
        <!-- icons -->
        <li class="icons">
          <a href="cart.html">
            <span>
            <img src="./images/shoppingBag.svg" alt="" />
            <small class="count d-flex">0</small>
          </span>
          </a>
          <span><i class="nav-heart far fa-heart"></i></span>
          
        </li>
      </ul>
      <label for="" class="btn open-btn"><i class="fas fa-bars"></i></label>
    </div>
  </nav>

  <div class="hero">
    <div class="row">
      <div class="swiper-container slider-1">
        <div class="swiper-wrapper">
          <div class="swiper-slide">
            <img src="./images/hero-1.png" alt="" />
            <div class="content">
              <h1>Super market vegbox
                <br/>
                start from 
                <span>$9</span>
              </h1>
              <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Corrupti ad natus facilis magni corporis alias.</p>

              <a href="#">Shop Now</a>
            </div>
          </div>

          <div class="swiper-slide">
            <img src="./images/hero-2.png" alt="hero image" />
            <div class="content">
              <h1>You first Order
                <br/>
                <span>20% off</span>
                at Juice
              </h1>
              <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Corrupti ad natus facilis magni corporis alias.</p>
              <a href="#">Shop Now</a>
            </div>
          </div>
          
          <div class="swiper-slide">
            <img src="./images/hero-3.png" alt="hero image" />
            <div class="content">
              <h1>You first Order
                <br/>
                <span>20% off</span>
                at Juice
              </h1>
              <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Corrupti ad natus facilis magni corporis alias.</p>
              <a href="#">Shop Now</a>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Carousel Navigation -->
    <div class="arrows d-flex">
        <div class="swiper-prev d-flex">
          <i class="bx bx-chevrons-left swiper-icon"></i>
        </div>
        <div class="swiper-next d-flex">
          <i class="bx bx-chevrons-right swiper-icon"></i>
        </div>
    </div>
  </div>

  <!-- Promotion -->

  <section class="section promotion">
    <div class="title">
      <h2>Shop Collections</h2>
      <span>Select from the premium product and save plenty money</span>
    </div>

    <div class="promotion-layout container">
      <div class="promotion-item">
        <img src="./images/promo1.jpg" alt="" />
        <div class="promotion-content">
          <h3>JUICE</h3>
          <a href="">SHOP NOW</a>
        </div>
      </div>

      <div class="promotion-item">
        <img src="./images/promo2.jpg" alt="" />
        <div class="promotion-content">
          <h3>MANGO</h3>
          <a href="">SHOP NOW</a>
        </div>
      </div>

      <div class="promotion-item">
        <img src="./images/promo3.jpg" alt="" />
        <div class="promotion-content">
          <h3>GRAPES</h3>
          <a href="">SHOP NOW</a>
        </div>
      </div>

      <div class="promotion-item">
        <img src="./images/promo4.jpg" alt="" />
        <div class="promotion-content">
          <h3>POTATOE</h3>
          <a href="">SHOP NOW</a>
        </div>
      </div>

      <div class="promotion-item">
        <img src="./images/promo5.jpg" alt="" />
        <div class="promotion-content">
          <h3>ORANGE</h3>
          <a href="">SHOP NOW</a>
        </div>
      </div>

      <div class="promotion-item">
        <img src="./images/promo6.jpg" alt="" />
        <div class="promotion-content">
          <h3>PINEAPPLE</h3>
          <a href="">SHOP NOW</a>
        </div>
      </div>
    </div>
  </section>

  <!-- Featured -->
  <section class="section featured">
    <div class="title">
      <h2>Featured Products</h2>
      <span>Select from the premium product brands and save plenty money</span>
    </div>

    <div class="row container">
      <div class="swiper-container slider-2">
        <div class="swiper-wrapper">
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-1.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="productDetails.html">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-8.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-10.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-7.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-6.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-5.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-1.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide">
            <div class="product">
              <div class="img-container">
                <img src="./images/product-10.jpg" alt="" />
                <div class="addCart">
                  <i class="fas fa-shopping-cart"></i>
                </div>

                <ul class="side-icons">
                  <span><i class="far fa-heart"></i></span>
                </ul>
              </div>
              <div class="bottom">
                <a href="">Bambi Print Mini Backpack</a>
                <div class="price">
                  <span>$150</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

     <!-- Carousel Navigation -->
    <div class="arrows d-flex">
       <div class="custom-next d-flex">
          <i class="bx bx-chevrons-right swiper-icon"></i>
        </div>
        <div class="custom-prev d-flex">
          <i class="bx bx-chevrons-left swiper-icon"></i>
        </div>
    </div>
  </section>

  <!-- Products -->
  <section class="section products">
    <div class="title">
      <h2>New Products</h2>
      <span>Select from the premium product brands and save plenty money</span>
    </div>

    <div class="product-layout">
      <div class="product">
        <div class="img-container">
          <img src="./images/product-9.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>
          <div class="price">
            <span>$150</span>
          </div>
        </div>
      </div>

      <div class="product">
        <div class="img-container">
          <img src="./images/product-1.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>
          <div class="price">
            <span>$150</span>
            <span class="cancel">$160</span>
          </div>
        </div>
      </div>

      <div class="product">
        <div class="img-container">
          <img src="./images/product-2.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>
          <div class="price">
            <span>$150</span>
          </div>
        </div>
      </div>

      <div class="product">
        <div class="img-container">
          <img src="./images/product-4.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>
          <div class="price">
            <span>$150</span>
            <span class="cancel">$160</span>
          </div>
        </div>
      </div>

      <div class="product">
        <div class="img-container">
          <img src="./images/product-5.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>
          <div class="price">
            <span>$150</span>
          </div>
        </div>
      </div>

      <div class="product">
        <div class="img-container">
          <img src="./images/product-6.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>

          <div class="price">
            <span>$150</span>
          </div>
        </div>
      </div>

      <div class="product">
        <div class="img-container">
          <img src="./images/product-7.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>

          <div class="price">
            <span>$150</span>
            <span class="cancel">$160</span>
          </div>
        </div>
      </div>

      <div class="product">
        <div class="img-container">
          <img src="./images/product-8.jpg" alt="" />
          <div class="addCart">
            <i class="fas fa-shopping-cart"></i>
          </div>

          <ul class="side-icons">
            <span><i class="far fa-heart"></i></span>
          </ul>
        </div>
        <div class="bottom">
          <a href="">Bambi Print Mini Backpack</a>
          <div class="price">
            <span>$150</span>
            <span class="cancel">$160</span>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- ADVERT -->
  <section class="section advert">
    <div class="advert-layout container">
      <div class="item ">
        <img src="./images/kit.png" alt="">
        <div class="content">
          <span>Exclusive Sales</span>
          <h3>Spring Collections</h3>
          <a href="">View Collection</a>
        </div>
      </div>
      <div class="item">
        <img src="./images/kit.png" alt="">
        <div class="content">
          <span>New Trending</span>
          <h3>Designer Bags</h3>
          <a href="">Shop Now </a>
        </div>
      </div>
    </div>
  </section>

  <!-- BRANDS -->
  <section class="section brands">
    <div class="title">
      <h2>Shop by Brand</h2>
      <span>Select from the premium product brands and save plenty money</span>
    </div>

    <div class="brand-layout container">
      <div class="swiper-container slider-3">
        <div class="swiper-wrapper">
          <div class="swiper-slide">
            <img src="./images/brand1.png" alt="">
          </div>
          <div class="swiper-slide">
            <img src="./images/brand2.png" alt="">
          </div>
          <div class="swiper-slide">
            <img src="./images/brand3.png" alt="">
          </div>
          <div class="swiper-slide">
            <img src="./images/brand4.png" alt="">
          </div>
          <div class="swiper-slide">
            <img src="./images/brand5.png" alt="">
          </div>
          <div class="swiper-slide">
            <img src="./images/brand6.png" alt="">
          </div>
          <div class="swiper-slide">
            <img src="./images/brand7.png" alt="">
          </div>
          
        </div>
      </div>
    </div>
  </section>

  <!-- Footer -->
  <footer id="footer" class="section footer">
    <div class="container">
      <div class="footer-container">
        <div class="footer-center">
          <h3>EXTRAS</h3>
          <a href="#">Brands</a>
          <a href="#">Gift Certificates</a>
          <a href="#">Affiliate</a>
          <a href="#">Specials</a>
          <a href="#">Site Map</a>
        </div>
        <div class="footer-center">
          <h3>INFORMATION</h3>
          <a href="#">About Us</a>
          <a href="#">Privacy Policy</a>
          <a href="#">Terms & Conditions</a>
          <a href="#">Contact Us</a>
          <a href="#">Site Map</a>
        </div>
        <div class="footer-center">
          <h3>MY ACCOUNT</h3>
          <a href="#">My Account</a>
          <a href="#">Order History</a>
          <a href="#">Wish List</a>
          <a href="#">Newsletter</a>
          <a href="#">Returns</a>
        </div>
        <div class="footer-center">
          <h3>CONTACT US</h3>
          <div>
            <span>
              <i class="fas fa-map-marker-alt"></i>
            </span>
            42 Dream House, Dreammy street, 7131 Dreamville, USA
          </div>
          <div>
            <span>
              <i class="far fa-envelope"></i>
            </span>
            company@gmail.com
          </div>
          <div>
            <span>
              <i class="fas fa-phone"></i>
            </span>
            456-456-4512
          </div>
          <div class="payment-methods">
            <img src="./images/payment.png" alt="">
          </div>
        </div>
      </div>
    </div>
    </div>
  </footer>
  <!-- End Footer -->

  <!-- ======== SwiperJS ======= -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/6.7.5/swiper-bundle.min.js"></script>
  <!-- Custom Scripts -->
  <script src="./js/slider.js"></script>
  <script src="./js/index.js"></script>
<!-- Code injected by live-server -->
<script type="text/javascript">
	// <![CDATA[  <-- For SVG support
	if ('WebSocket' in window) {
		(function () {
			function refreshCSS() {
				var sheets = [].slice.call(document.getElementsByTagName("link"));
				var head = document.getElementsByTagName("head")[0];
				for (var i = 0; i < sheets.length; ++i) {
					var elem = sheets[i];
					var parent = elem.parentElement || head;
					parent.removeChild(elem);
					var rel = elem.rel;
					if (elem.href && typeof rel != "string" || rel.length == 0 || rel.toLowerCase() == "stylesheet") {
						var url = elem.href.replace(/(&|\?)_cacheOverride=\d+/, '');
						elem.href = url + (url.indexOf('?') >= 0 ? '&' : '?') + '_cacheOverride=' + (new Date().valueOf());
					}
					parent.appendChild(elem);
				}
			}
			var protocol = window.location.protocol === 'http:' ? 'ws://' : 'wss://';
			var address = protocol + window.location.host + window.location.pathname + '/ws';
			var socket = new WebSocket(address);
			socket.onmessage = function (msg) {
				if (msg.data == 'reload') window.location.reload();
				else if (msg.data == 'refreshcss') refreshCSS();
			};
			if (sessionStorage && !sessionStorage.getItem('IsThisFirstTime_Log_From_LiveServer')) {
				console.log('Live reload enabled.');
				sessionStorage.setItem('IsThisFirstTime_Log_From_LiveServer', true);
			}
		})();
	}
	else {
		console.error('Upgrade your browser. This Browser is NOT supported WebSocket for Live-Reloading.');
	}
	// ]]>
</script></body>

</html>

